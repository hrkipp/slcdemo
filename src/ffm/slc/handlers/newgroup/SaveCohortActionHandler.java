package ffm.slc.handlers.newgroup;

import ffm.slc.actions.newgroup.SaveCohort;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Cohort;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SaveCohortActionHandler implements ActionHandler<SaveCohort, SaveCohort.Result> {
    @Override
    public SaveCohort.Result execute(SaveCohort action) throws ActionException {

        Cohort cohort = new Cohort();

        cohort.setCohortDescription(action.getDescription());
        cohort.setCohortIdentifier(action.getName());


        return null;
    }
}
