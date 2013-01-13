package ffm.slc.actions.group;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sections {
    private String name;
    private String lessionObjective;
    private DataPoint[] data;

    public Sections(String name, String lessionObjective, DataPoint[] data) {
        this.name = name;
        this.lessionObjective = lessionObjective;
        this.data = data;
    }
}
