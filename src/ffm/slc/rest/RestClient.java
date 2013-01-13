package ffm.slc.rest;

import com.google.inject.Inject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.servlet.http.HttpSession;

@Singleton
public class RestClient {

	private Client client;
	private final Provider<HttpSession> sessionProvider;
	private final String baseUri;
	private final String auth_token;

	@Inject
	public RestClient(final Provider<HttpSession> sessionProvider, @Named("slc.api.url") String baseUri, @Auth String auth_token) {

		this.baseUri = baseUri;
		this.auth_token = auth_token;
		client = Client.create();

		this.sessionProvider = sessionProvider;
	}


	public String get(String uri) {

		if (!isAuthorized()) {
			return null;
		}

		return client.resource(uri).accept("application/json")
				.header("Content-Type", "application/json")
				.header("Authorization", "bearer " + sessionProvider.get().getAttribute(auth_token))
				.get(String.class);
	}


	public boolean isAuthorized() {
		return sessionProvider.get().getAttribute(auth_token) != null;
	}


	public String getRelative(String uri) {

		if (!isAuthorized()) {
			return null;
		}

		return client.resource(baseUri + uri).accept("application/json")
				.header("Content-Type", "application/json")
				.header("Authorization", "bearer " + sessionProvider.get().getAttribute(auth_token))
				.get(String.class);
	}

	public ClientResponse postRelative(String uri, String json) {

		if (!isAuthorized()) {
			return null;
		}

		WebResource.Builder res = client.resource(baseUri + uri).accept("application/vnd.slc+json")
				.header("Authorization", "bearer " + sessionProvider.get().getAttribute(auth_token)).header("Content-Type", "application/vnd.slc+json");

		return res.post(ClientResponse.class, json);

	}

    public ClientResponse post(String uri, String json) {

        if (!isAuthorized()) {
            return null;
        }

        WebResource.Builder res = client.resource(uri).accept("application/vnd.slc+json")
                .header("Authorization", "bearer " + sessionProvider.get().getAttribute(auth_token)).header("Content-Type", "application/vnd.slc+json");

        return res.post(ClientResponse.class, json);

    }
}
