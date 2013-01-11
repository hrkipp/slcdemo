package ffm.slc.model.resources;

import com.google.gson.*;

import java.lang.reflect.Type;

public class IntegerResource implements JsonSerializer<IntegerResource>, JsonDeserializer<IntegerResource> {

	protected int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public JsonElement serialize(IntegerResource stringResource, Type type, JsonSerializationContext jsonSerializationContext) {
		return jsonSerializationContext.serialize(value);
	}

	@Override
	public IntegerResource deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
		IntegerResource object = null;
		try {
			object = (IntegerResource) ((Class)type).newInstance();
			object.setValue(jsonElement.getAsInt());
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String toString(){
		return value+"";
	}

}
