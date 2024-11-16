package dev.jsinco.discord.objects;

import dev.jsinco.discord.files.ConfigurationGson;
import dev.jsinco.discord.framework.serdes.Serdes;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {

    private static final List<ExampleObject> objects = new ArrayList<>();

    public static void load() {
        Serdes serdes = Serdes.getInstance(); // Serdes provided by framework

        for (String serializedObject : ConfigurationGson.getInstance().someSerializedObjects) {
            // Uses Gson to deserialize the object
            objects.add(serdes.deserialize(serializedObject, ExampleObject.class));
        }
    }

    public static void saveAll() {
        Serdes serdes = Serdes.getInstance(); // Serdes provided by framework

        for (ExampleObject object : objects) {
            // Uses Gson to serialize the object
            ConfigurationGson.getInstance().someSerializedObjects.add(serdes.serialize(object));
        }
    }
}
