package ffm.slc.handlers.dashboard;

import ffm.slc.actions.dashboard.DbGroup;
import ffm.slc.actions.dashboard.loadDashboard;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Cohort;
import ffm.slc.model.Staff;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 6:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoadDashboardActionHandler implements ActionHandler<loadDashboard, loadDashboard.Result> {

    private Staff.DAO staffDAO;
    private Cohort.DAO cohortDAO;

    @Inject
    public LoadDashboardActionHandler(Staff.DAO staffDAO, Cohort.DAO cohortDAO) {
        this.staffDAO = staffDAO;
        this.cohortDAO = cohortDAO;
    }


    @Override
    public loadDashboard.Result execute(loadDashboard action) throws ActionException {

        Staff staff = staffDAO.getCurrent();

        String name = staff.getName().getFullame();

        Cohort[] cohorts = cohortDAO.getAll(staff.getId().getValue());

        DbGroup[] groups = new DbGroup[cohorts.length];
        for(int i = 0; i<cohorts.length;i++){
            groups[i] = new DbGroup(cohorts[i].getCohortIdentifier(), cohorts[i].getId().getValue(),null);
        }


        return new loadDashboard.Result(name, groups);
    }
}
