package ffm.slc.dispatch;

import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import ffm.slc.guice.HandlerModule;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/7/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DispatchServlet extends HttpServlet {

    Gson gson = new Gson();

    Injector inj =  Guice.createInjector(new HandlerModule());

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actionName = (String) req.getAttribute("action");

        String json = (String) req.getAttribute("data");

        Class<? extends Action<?>> actionClass = null;

        try {
            actionClass = (Class<? extends Action<?>>) Class.forName(actionName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Action action = gson.fromJson(json, actionClass);

        Class<? extends ActionHandler> actionHandlerClass = action.getClass().getAnnotation(Handler.class).value();

        ActionHandler actionHandler = inj.getInstance(actionHandlerClass);

        try {
            Result result = actionHandler.execute(action);
            resp.getWriter().append(gson.toJson(result));
            resp.getWriter().close();
        } catch (ActionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }







}
