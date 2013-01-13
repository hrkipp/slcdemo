package ffm.slc.actions.group;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.handlers.group.LoadGroupActionHandler;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Handler(LoadGroupActionHandler.class)
public class loadGroup implements Action<loadGroup.Result> {
    private String id;

    public loadGroup(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static class Result implements ffm.slc.dispatch.Result{
        private String name;
        private String username;
        private String description;
        private Sections[] sections;

        public Result(String name, String username, String description, Sections[] sections) {
            this.name = name;
            this.username = username;
            this.description = description;
            this.sections = sections;
        }
    }
}
