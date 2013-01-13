package ffm.slc.handlers.group;

import com.google.inject.Inject;
import ffm.slc.actions.group.DataPoint;
import ffm.slc.actions.group.Sections;
import ffm.slc.actions.group.loadGroup;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Cohort;
import ffm.slc.model.Staff;
import ffm.slc.model.Student;
import ffm.slc.model.StudentCohortAssociation;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/13/13
 * Time: 9:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoadGroupActionHandler implements ActionHandler<loadGroup, loadGroup.Result> {

    private Cohort.DAO cohortDAO;
    private StudentCohortAssociation.DAO scaDAO;
    private Staff.DAO staffDAO;
    private Student.DAO studentDAO;

    @Inject
    public LoadGroupActionHandler(Cohort.DAO cohortDAO, StudentCohortAssociation.DAO scaDAO, Staff.DAO staffDAO) {
        this.cohortDAO = cohortDAO;
        this.scaDAO = scaDAO;
        this.staffDAO = staffDAO;
    }


    @Override
    public loadGroup.Result execute(loadGroup action) throws ActionException {

        Cohort cohort = cohortDAO.get(action.getId());

        StudentCohortAssociation[] scas = scaDAO.getAll(cohort);

        String name = cohort.getCohortIdentifier();

        Staff staff = staffDAO.getCurrent();
        String username = staff.getName().getFullame();
        String desc = cohort.getCohortDescription();

        Sections[] sections = new Sections[cohort.getCustom().getSessionLength()];

        for(int i = 0;i<cohort.getCustom().getSessionLength();i++){
            Cohort.Custom c = cohort.getCustom();
            String column = "Week" + (i+1);

            DataPoint[] data = new DataPoint[scas.length];
            for(int j = 0;j<data.length;j++){

                Student s = studentDAO.get(scas[j].getStudentid());
                String sname = s.getName().getFullame();
                String id = scas[j].getId().getValue();
                int progress = scas[j].getCustom().getProgress()[i];
                String obs = scas[j].getCustom().getNotes()[i];
                Double score = scas[j].getCustom().getScore()[i];


                data[j] = new DataPoint(sname, id, progress, obs, score);
            }

            sections[i] = new Sections(column, c.getLearningObjectives()[i], data);
        }

        return new loadGroup.Result(name, username, desc, sections);
    }
}
