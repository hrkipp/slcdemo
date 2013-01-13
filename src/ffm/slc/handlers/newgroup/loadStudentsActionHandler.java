package ffm.slc.handlers.newgroup;

import com.google.inject.Inject;
import ffm.slc.actions.newgroup.loadStudents;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Student;

public class loadStudentsActionHandler implements ActionHandler<loadStudents, loadStudents.Result> {

    private Student.DAO students;

    @Inject
    public loadStudentsActionHandler(Student.DAO students) {
        this.students = students;
    }

    @Override
    public loadStudents.Result execute(loadStudents action) throws ActionException {




        return null;
    }
}
