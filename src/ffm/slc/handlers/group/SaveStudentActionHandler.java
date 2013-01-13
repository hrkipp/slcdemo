package ffm.slc.handlers.group;

import com.google.inject.Inject;
import ffm.slc.actions.group.SaveStudent;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.StudentCohortAssociation;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/13/13
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class SaveStudentActionHandler implements ActionHandler<SaveStudent, SaveStudent.Result> {

    private StudentCohortAssociation.DAO scaDAO;

    @Inject
    public SaveStudentActionHandler(StudentCohortAssociation.DAO scaDAO) {
        this.scaDAO = scaDAO;
    }


    @Override
    public SaveStudent.Result execute(SaveStudent action) throws ActionException {

        StudentCohortAssociation sca = scaDAO.get(action.getStudent(), action.getCohort());

        sca.getCustom().getNotes()[action.getWeek()] = action.getObservation();
        sca.getCustom().getProgress()[action.getWeek()] = action.getProgress();


        scaDAO.saveCustom(sca.getCustom(), action.getStudent());

        return new SaveStudent.Result();
    }
}
