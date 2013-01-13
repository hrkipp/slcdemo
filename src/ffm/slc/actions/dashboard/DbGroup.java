package ffm.slc.actions.dashboard;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class DbGroup {
    private String name;
    private String id;
    private int[][] sessions;

    public DbGroup(String name, String id, int[][] sessions) {
        this.name = name;
        this.id = id;
        this.sessions = sessions;
    }
}
