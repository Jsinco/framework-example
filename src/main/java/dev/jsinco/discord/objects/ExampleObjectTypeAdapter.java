package dev.jsinco.discord.objects;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

// Need a custom Gson TypeAdapter for this object? No problem! Just make sure to annotate your object with @TypeAdapter!
public class ExampleObjectTypeAdapter extends TypeAdapter<ExampleObject> {

    @Override
    public void write(JsonWriter out, ExampleObject value) throws IOException {
        out.beginObject();
        out.name("name").value(value.getName());
        out.name("age").value(value.getAge());
        out.endObject();
    }

    @Override
    public ExampleObject read(JsonReader in) throws IOException {
        in.beginObject();
        String name = null;
        int age = 0;

        while (in.hasNext()) {
            switch (in.nextName()) {
                case "name" -> name = in.nextString();
                case "age" -> age = in.nextInt();
            }
        }

        in.endObject();
        return new ExampleObject(name, age);
    }
}
