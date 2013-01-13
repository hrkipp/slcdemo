package ffm.slc.actions.dashboard;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.handlers.dashboard.LoadDashboardActionHandler;

import java.util.ArrayList;

@Handler(LoadDashboardActionHandler.class)
public class loadDashboard implements Action<loadDashboard.Result> {

    public static class Result implements ffm.slc.dispatch.Result{

        private String name;
        private DbGroup[] groups;

        public Result(String name, DbGroup[] groups) {
            this.name = name;
            this.groups = groups;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DbGroup[] getGroups() {
            return groups;
        }

        public void setGroups(DbGroup[] groups) {
            this.groups = groups;
        }
    }
}
