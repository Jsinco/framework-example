package dev.jsinco.discord.objects;

import dev.jsinco.discord.framework.serdes.TypeAdapter;

// An example object. You can provide a custom TypeAdapter for this object for serialization!

@TypeAdapter(ExampleObjectTypeAdapter.class) // Custom GSON type adapter
public class ExampleObject {

    private final String name;
    private final int age;

    public ExampleObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String
    toString() {
        return "ExampleObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
