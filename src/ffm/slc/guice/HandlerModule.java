package ffm.slc.guice;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.gson.*;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.mongodb.Mongo;
import ffm.slc.model.resources.IntegerResource;
import ffm.slc.model.resources.StringResource;
import ffm.slc.rest.Auth;
import ffm.slc.rest.SlcApi;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


public class HandlerModule extends AbstractModule {

	protected void configure() {

		String os = (String)System.getProperties().get("os.name");

		Properties properties = new Properties();
		try {
			if(((String)System.getProperties().get("os.name")).contains("Windows")){

				properties.load(this.getClass().getClassLoader()
						.getResourceAsStream("dev.properties"));
			}else {
				properties.load(new FileReader("live.properties"));
			}

			Names.bindProperties(binder(), properties);
		} catch (FileNotFoundException e) {
			System.out.println("The configuration file can not be found");
		} catch (IOException e) {
			System.out.println("I/O Exception during loading configuration");
		}

		bind(String.class).annotatedWith(Auth.class).toInstance("OAUTH_TOKEN");

		requestStaticInjection(SlcApi.class);

		bind(Gson.class).toInstance(new GsonBuilder().registerTypeHierarchyAdapter(StringResource.class, new StringResource())
				.registerTypeHierarchyAdapter(IntegerResource.class, new IntegerResource())
				.registerTypeHierarchyAdapter(Enum.class, new JsonDeserializer<Enum>() {
					@Override
					public Enum deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
						for (Object e : ((Class) type).getEnumConstants()) {
							if (e.toString().equals(jsonElement.getAsString())) {
								return (Enum) e;
							}
						}
						throw new JsonParseException("No enum found for that string.");
					}
				}).registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
					@Override
					public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
						SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

						return src == null ? null : new JsonPrimitive(fmt.format(src));
					}
				}).registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
					@Override
					public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
						SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
						try {
							return json == null ? null : fmt.parse(json.getAsString());
						} catch (Exception e) {
							return null;
						}
					}
				}).create());

        try {

            Mongo mongo = new Mongo("localhost", Integer.parseInt((String)properties.get("db.port")));
            Morphia morphia = new Morphia();

            bind(Mongo.class).toInstance(mongo);
            bind(Morphia.class).toInstance(morphia);

            bind(Datastore.class).toInstance(morphia.createDatastore(mongo, "slc"));

        } catch (Exception e) {
            e.printStackTrace();
        }

	}
}
