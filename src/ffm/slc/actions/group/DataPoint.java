package ffm.slc.actions.group;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 5:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataPoint {
    private String name;
    private String id;
    private int progress;
    private String observation;
    private Double score;

    public DataPoint(String name, String id, int progress, String observation, Double score) {
        this.name = name;
        this.id = id;
        this.progress = progress;
        this.observation = observation;
        this.score = score;
    }
}
