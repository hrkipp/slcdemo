package ffm.slc.dispatch;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/7/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class ActionException extends Exception {

    private String message;

    public ActionException(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
