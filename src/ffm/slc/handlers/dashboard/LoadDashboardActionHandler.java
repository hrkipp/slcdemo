package ffm.slc.handlers.dashboard;

import ffm.slc.actions.dashboard.loadDashboard;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
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

    @Inject
    public LoadDashboardActionHandler(Staff.DAO staffDAO) {
        this.staffDAO = staffDAO;
    }


    @Override
    public loadDashboard.Result execute(loadDashboard action) throws ActionException {

        Staff staff = staffDAO.getCurrent();

        String name = staff.getName().getFullame();



        return new loadDashboard.Result(name, null);
    }
}
