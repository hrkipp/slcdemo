package ffm.slc.dispatch;

import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import ffm.slc.guice.HandlerModule;
import ffm.slc.rest.Auth;
import ffm.slc.rest.SlcApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Singleton
public class DispatchServlet extends HttpServlet {

    private final Injector injector;
    private final String apiSecret;
    private final String apiKey;
    private final String auth_token;
    Gson gson = new Gson();

    private static final String OAUTH_CODE = "code";
    private static final String ENTRY_URL = "ENTRY_URL";

    @Inject
    public DispatchServlet(Injector injector, @Named("slc.api.secret") String apiSecret,
                           @Named("slc.api.key") String apiKey,
                           @Auth String auth_token){
        this.injector = injector;
        this.apiSecret = apiSecret;
        this.apiKey = apiKey;
        this.auth_token = auth_token;
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

            Class<? extends ActionHandler> actionHandlerClass = actionClass.getAnnotation(Handler.class).value();

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
