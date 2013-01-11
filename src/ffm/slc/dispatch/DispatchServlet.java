package ffm.slc.dispatch;

import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import ffm.slc.guice.HandlerModule;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Singleton
public class DispatchServlet extends HttpServlet {

	private final Injector injector;
	Gson gson = new Gson();

	@Inject
	public DispatchServlet(Injector injector){

		this.injector = injector;
	}

	@SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actionName = req.getParameter("action");

        String json = req.getParameter("data");

        Class<? extends Action<?>> actionClass = null;

        try {
            actionClass = (Class<? extends Action<?>>) Class.forName(actionName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Action action = gson.fromJson(json, actionClass);

        Class<? extends ActionHandler> actionHandlerClass = action.getClass().getAnnotation(Handler.class).value();

        ActionHandler actionHandler = injector.getInstance(actionHandlerClass);

        try {
            Result result = actionHandler.execute(action);
            resp.getWriter().append(gson.toJson(result));
            resp.getWriter().close();
        } catch (ActionException e) {
            e.printStackTrace();
        }

    }







}
