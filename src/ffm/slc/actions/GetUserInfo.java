package ffm.slc.actions;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.DispatchServlet;
import ffm.slc.dispatch.Handler;
import ffm.slc.handlers.GetUserInfoActionHandler;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/7/13
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */

@Handler(GetUserInfoActionHandler.class)
public class GetUserInfo implements Action<GetUserInfo.Result> {

    private String email;

    private GetUserInfo(){}

    public GetUserInfo(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public static class Result implements ffm.slc.dispatch.Result {

        private String email;

        private Result(){}

        public Result(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }

}
