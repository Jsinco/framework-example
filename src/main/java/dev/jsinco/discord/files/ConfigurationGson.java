package dev.jsinco.discord.files;

import dev.jsinco.discord.framework.settings.AbstractOkaeriConfig;
import eu.okaeri.configs.annotation.Exclude;
import eu.okaeri.configs.json.gson.JsonGsonConfigurer;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationGson extends AbstractOkaeriConfig {

    // Don't forget to exclude this field!
    @Exclude
    public static final ConfigurationGson INSTANCE = createConfig(ConfigurationGson.class, dataFolderPath, "config.json", new JsonGsonConfigurer());

    // I recommend using Lombok
    public static ConfigurationGson getInstance() {
        return INSTANCE;
    }

    public List<String> someSerializedObjects = new ArrayList<>();
}
