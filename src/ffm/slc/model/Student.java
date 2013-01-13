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
 * Time: 7:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student extends Entity {

    private Name name;


    public Student(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
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

        public Student[] getAll(String section){
            String uri = "api/rest/v1/sections/{id}/studentSectionAssociations/students".replace("{id}", section);
            return gson.fromJson(restClient.getRelative(uri), Student[].class);
        }

        public Student get(String id){
            return null;
        }



    }




}

