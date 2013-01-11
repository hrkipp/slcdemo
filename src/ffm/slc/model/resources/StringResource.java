package ffm.slc.model.resources;

import com.google.gson.*;

import java.lang.reflect.Type;

public class StringResource  implements JsonSerializer<StringResource>, JsonDeserializer<StringResource> {

	protected String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public JsonElement serialize(StringResource stringResource, Type type, JsonSerializationContext jsonSerializationContext) {
		return jsonSerializationContext.serialize(value);
	}

	@Override
	public StringResource deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		StringResource object = null;
		try {
			object = (StringResource) ((Class)type).newInstance();
			object.setValue(jsonElement.getAsString());
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String toString(){
		return value;
	}

}
