package ffm.slc.actions.newgroup;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Result;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class loadStudents implements Action {
    private String session;

    public class result implements Result{
        public Student[] students;

    }
}
