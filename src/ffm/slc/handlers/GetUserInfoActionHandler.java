package ffm.slc.handlers;

import ffm.slc.actions.GetUserInfo;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/7/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetUserInfoActionHandler implements ActionHandler<GetUserInfo, GetUserInfo.Result> {

    @Override
    public GetUserInfo.Result execute(GetUserInfo action) throws ActionException {
        return new GetUserInfo.Result("testEmail");
    }
}
