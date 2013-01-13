package ffm.slc.auth;

import com.google.gson.Gson;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import ffm.slc.dispatch.*;
import ffm.slc.rest.Auth;
import ffm.slc.rest.SlcApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Singleton
public class LoginFilter implements Filter {

    private static final String OAUTH_CODE = "code";
    private static final String ENTRY_URL = "ENTRY_URL";
    private final Injector injector;
    private final String apiSecret;
    private final String apiKey;

    private final String auth_token;
    private Gson gson;

    @Inject
    public LoginFilter(Injector injector, @Named("slc.api.secret") String apiSecret,
                           @Named("slc.api.key") String apiKey,
                           @Auth String auth_token, Gson gson){
        this.injector = injector;
        this.apiSecret = apiSecret;
        this.apiKey = apiKey;
        this.auth_token = auth_token;
        this.gson = gson;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest)req).getSession();

        OAuthService service = new ServiceBuilder().
                provider(SlcApi.class).
                callback(((HttpServletRequest)req).getRequestURL().toString()).
                apiKey(apiKey).apiSecret(apiSecret).
                build();

        Object token = session.getAttribute(auth_token);

        if (token == null && req.getParameter(OAUTH_CODE) == null) {

            session.setAttribute(ENTRY_URL, ((HttpServletRequest)req).getRequestURL());
            String authUrl = service.getAuthorizationUrl(null);
            ((HttpServletResponse)resp).sendRedirect(authUrl);

        } else if (token == null && req.getParameter(OAUTH_CODE) != null) {

            Verifier verifier = new Verifier(req.getParameter(OAUTH_CODE));
            Token accessToken = service.getAccessToken(null, verifier);
            session.setAttribute(auth_token, accessToken.getToken());
            Object entryUrl = session.getAttribute(ENTRY_URL);
            System.out.println(accessToken.getToken());
            if (entryUrl != null) {
                ((HttpServletResponse)resp).sendRedirect(entryUrl.toString());
            } else {
                ((HttpServletResponse)resp).sendRedirect(((HttpServletRequest) req).getRequestURI());
            }
        }else{
            filterChain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
