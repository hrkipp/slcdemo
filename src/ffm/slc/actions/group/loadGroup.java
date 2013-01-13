package ffm.slc.actions.group;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Result;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class loadGroup implements Action {
    private String id;

    public class Result implements ffm.slc.dispatch.Result{
        private String name;
        private String username;
        private String description;
        private Session[] sessions;
    }
}
