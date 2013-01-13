package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Section extends Entity {
   private String uniqueSectionCode;

    public Section(String uniqueSectionCode) {
        this.uniqueSectionCode = uniqueSectionCode;
    }

    public String getUniqueSectionCode() {
        return uniqueSectionCode;
    }

    public void setUniqueSectionCode(String uniqueSectionCode) {
        this.uniqueSectionCode = uniqueSectionCode;
    }

    public static class DAO {

        private final RestClient restClient;
        private final Gson gson;
        private Provider<HttpSession> sessionProvder;

        @Inject
        public DAO(RestClient restClient, Gson gson, Provider<HttpSession> sessionProvder){
            this.restClient = restClient;
            this.gson = gson;
            this.sessionProvder = sessionProvder;
        }

        public Section[] getAll() {

            Entity home = null;
            if(sessionProvder.get().getAttribute("home") == null){
                home = gson.fromJson(restClient.getRelative("api/rest/v1/home"), Entity.class);
                sessionProvder.get().setAttribute("home", home);
            }
            home = (Entity) sessionProvder.get().getAttribute("home");
            String ret = restClient.get(home.getLink("getSections"));
            return gson.fromJson(ret, Section[].class);
        }

        public Section get(String id) {
            String ret = restClient.getRelative("api/rest/v1/sections/"+id);
            return gson.fromJson(ret, Section.class);
        }


    }
}
