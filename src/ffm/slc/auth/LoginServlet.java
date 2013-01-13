package ffm.slc.auth;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import ffm.slc.rest.Auth;
import ffm.slc.rest.SlcApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Singleton
public class LoginServlet extends HttpServlet {

	private final String apiSecret;
	private final String apiKey;
	private final String auth_token;

	private static final String OAUTH_CODE = "code";
	private static final String ENTRY_URL = "ENTRY_URL";

	@Inject
	public LoginServlet(@Named("slc.api.secret") String apiSecret,
        @Named("slc.api.key") String apiKey,
        @Auth String auth_token)
        {
		this.apiSecret = apiSecret;
		this.apiKey = apiKey;
		this.auth_token = auth_token;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

		OAuthService service = new ServiceBuilder().
				provider(SlcApi.class).
				callback(req.getRequestURL().toString()).
				apiKey(apiKey).apiSecret(apiSecret).
				build();

		Object token = session.getAttribute(auth_token);

		if (token == null && req.getParameter(OAUTH_CODE) == null) {

			session.setAttribute(ENTRY_URL, req.getRequestURL());
			String authUrl = service.getAuthorizationUrl(null);
			resp.sendRedirect(authUrl);

		} else if (token == null && req.getParameter(OAUTH_CODE) != null) {

			Verifier verifier = new Verifier(req.getParameter(OAUTH_CODE));
			Token accessToken = service.getAccessToken(null, verifier);
			session.setAttribute(auth_token, accessToken.getToken());
			Object entryUrl = session.getAttribute(ENTRY_URL);
			if (entryUrl != null) {
				resp.sendRedirect(entryUrl.toString());
			} else {
				resp.sendRedirect(req.getRequestURI());
			}
		} else {

        }
	}

}
