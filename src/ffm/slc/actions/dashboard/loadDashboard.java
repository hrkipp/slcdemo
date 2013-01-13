package ffm.slc.actions.dashboard;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Result;

import java.util.ArrayList;

public class loadDashboard implements Action {

    public class Result implements ffm.slc.dispatch.Result{
            private String name;
            private DbGroup[] groups;
    }
}
