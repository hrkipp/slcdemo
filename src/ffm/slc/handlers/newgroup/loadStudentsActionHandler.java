package ffm.slc.handlers.newgroup;

import com.google.inject.Inject;
import ffm.slc.actions.newgroup.loadStudents;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Student;

public class loadStudentsActionHandler implements ActionHandler<loadStudents, loadStudents.Result> {

    private Student.DAO studentDAO;

    @Inject
    public loadStudentsActionHandler(Student.DAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public loadStudents.Result execute(loadStudents action) throws ActionException {

        Student[] students = studentDAO.getAll(action.getSession());

        ffm.slc.actions.newgroup.Student[] dtos = new ffm.slc.actions.newgroup.Student[students.length];

        for(int i = 0; i<students.length;i++){
            dtos[i] = new ffm.slc.actions.newgroup.Student(students[i].getName().getFullame(), students[i].getId().getValue());
        }

        return new loadStudents.Result(dtos);
    }
}
