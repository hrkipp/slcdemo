package ffm.slc.handlers.dashboard;

import ffm.slc.actions.dashboard.DbGroup;
import ffm.slc.actions.dashboard.loadDashboard;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Cohort;
import ffm.slc.model.Staff;
import ffm.slc.model.Student;
import ffm.slc.model.StudentCohortAssociation;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;

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
    private StudentCohortAssociation.DAO scaDAO;
    private Student.DAO studentDAO;

    @Inject
    public LoadDashboardActionHandler(Staff.DAO staffDAO, Cohort.DAO cohortDAO, StudentCohortAssociation.DAO scaDAO, Student.DAO studentDAO) {
        this.staffDAO = staffDAO;
        this.cohortDAO = cohortDAO;
        this.scaDAO = scaDAO;
        this.studentDAO = studentDAO;
    }


    @Override
    public loadDashboard.Result execute(loadDashboard action) throws ActionException {

        Staff staff = staffDAO.getCurrent();

        String name = staff.getName().getFullame();

        Cohort[] cohorts = cohortDAO.getAll(staff.getId().getValue());

        DbGroup[] groups = new DbGroup[cohorts.length];
        for(int i = 0; i<cohorts.length;i++){

            StudentCohortAssociation[] scas = scaDAO.getAll(cohorts[i]);

            int[][] data = new int[scas.length][cohorts[i].getCustom().getSessionLength()];

            String[] students = new String[scas.length];

            for(int j = 0; i<scas.length;j++){
                Student s = studentDAO.get(scas[j].getStudentid());

                students[j] = s.getName().getFullame();

                for(int k = 0; k<cohorts[i].getCustom().getSessionLength();k++){
                    data[i][k] = scas[j].getCustom().getProgress()[k];
                }
            }

            Date date = cohorts[i].getCustom().getBeginDate();

            Calendar c = Calendar.getInstance();
            c.setTime(date);

            int startWeek = c.getWeekYear();

            groups[i] = new DbGroup(cohorts[i].getCohortIdentifier(), cohorts[i].getId().getValue(),null, students, startWeek);
        }



        return new loadDashboard.Result(name, groups);
    }
}
