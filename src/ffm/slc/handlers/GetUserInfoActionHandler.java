package ffm.slc.handlers;

import com.google.inject.Inject;
import ffm.slc.actions.GetUserInfo;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Staff;

public class GetUserInfoActionHandler implements ActionHandler<GetUserInfo, GetUserInfo.Result> {


	private final Staff.DAO staffDAO;

	@Inject
	public GetUserInfoActionHandler(Staff.DAO staffDAO){
		this.staffDAO = staffDAO;
	}


    @Override
    public GetUserInfo.Result execute(GetUserInfo action) throws ActionException {

		Staff staff = staffDAO.getCurrent();

        return new GetUserInfo.Result(staff.getName().getFullame());

    }
}
