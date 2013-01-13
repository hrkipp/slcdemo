package ffm.slc.actions.newgroup;


import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.handlers.newgroup.LoadSessionsActionHandler;

@Handler(LoadSessionsActionHandler.class)
public class loadSessions implements Action<loadSessions.Result> {

    public static class Result implements ffm.slc.dispatch.Result{
        private Session[] sessions;

        public Result(Session[] sessions) {
            this.sessions = sessions;
        }
    }
}
