package ffm.slc.actions.newgroup;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.dispatch.Result;
import ffm.slc.handlers.newgroup.loadStudentsActionHandler;

@Handler(loadStudentsActionHandler.class)
public class loadStudents implements Action<loadStudents.Result> {
    private String session;

    public loadStudents(String session) {
        this.session = session;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public static class Result implements ffm.slc.dispatch.Result{
        private Student[] students;

        public Result(Student[] students) {
            this.students = students;
        }

        public Student[] getStudents() {
            return students;
        }

        public void setStudents(Student[] students) {
            this.students = students;
        }
    }
}
