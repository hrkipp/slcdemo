package ffm.slc.handlers.newgroup;

import com.google.inject.Inject;
import ffm.slc.actions.newgroup.Session;
import ffm.slc.actions.newgroup.loadSessions;
import ffm.slc.dispatch.ActionException;
import ffm.slc.dispatch.ActionHandler;
import ffm.slc.model.Section;
import ffm.slc.model.Staff;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoadSessionsActionHandler implements ActionHandler<loadSessions, loadSessions.Result> {

    private Section.DAO sectionDAO;
    private Staff.DAO staffDAO;

    @Inject
    public LoadSessionsActionHandler(Section.DAO sectionDAO, Staff.DAO staffDAO) {
        this.sectionDAO = sectionDAO;
        this.staffDAO = staffDAO;
    }

    @Override
    public loadSessions.Result execute(loadSessions action) throws ActionException {

        Section[] sections = sectionDAO.getAll();

        Session[] sess = new Session[sections.length];

        for(int i = 0;i<sections.length;i++){
            sess[i] = new Session(sections[i].getUniqueSectionCode(), sections[i].getId().getValue());
        }
        String name = staffDAO.getCurrent().getName().getFullame();
        return new loadSessions.Result(sess,name);
    }
}
