package ffm.slc.dispatch;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/7/13
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ActionHandler <A extends Action<R>, R extends Result> {

    public R execute(A action) throws ActionException;

}
