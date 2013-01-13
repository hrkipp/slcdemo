package ffm.slc.handlers.newgroup;

import com.google.inject.Inject;
import ffm.slc.actions.newgroup.SaveCohort;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.*;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SaveCohortActionHandler implements ActionHandler<SaveCohort, SaveCohort.Result> {

    private Cohort.DAO cohortDAO;
    private Staff.DAO staffDAO;
    private StaffCohortAssociation.DAO stcaDAO;
    private StudentCohortAssociation.DAO scaDAO;
    private School.DAO schoolDAO;

    @Inject
    public SaveCohortActionHandler(Cohort.DAO cohortDAO, Staff.DAO staffDAO, StaffCohortAssociation.DAO stcaDAO, StudentCohortAssociation.DAO scaDAO, School.DAO schoolDAO) {
        this.cohortDAO = cohortDAO;
        this.staffDAO = staffDAO;
        this.stcaDAO = stcaDAO;
        this.scaDAO = scaDAO;
        this.schoolDAO = schoolDAO;
    }


    @Override
    public SaveCohort.Result execute(SaveCohort action) throws ActionException {

        Cohort cohort = new Cohort();

        cohort.setCohortDescription(action.getDescription());
        cohort.setCohortIdentifier(action.getName());

        //TODO MORE DATA!



        Staff staff = staffDAO.getCurrent();

        School[] schools = schoolDAO.get(staff);

        cohort.setEducationOrg(schools[0].getId().getValue());

        cohort.setStaffId(new String[]{staff.getId().getValue()});

        String id = cohortDAO.save(cohort);


        StaffCohortAssociation stca = new StaffCohortAssociation();
        stca.setBeginDate(new Date());
        stca.setCohort(id);
        stca.setStaff(staff.getId().getValue());

        String scaId = stcaDAO.save(stca);


        for(String s : action.getStudents()){
            StudentCohortAssociation sca = new StudentCohortAssociation();
            sca.setStudent(s);
            sca.setCohort(id);
            scaDAO.save(sca);
        }





        return new SaveCohort.Result();
    }
}
