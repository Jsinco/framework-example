package dev.jsinco.discord.files;

import dev.jsinco.discord.framework.settings.AbstractOkaeriConfig;
import eu.okaeri.configs.annotation.Exclude;

// Make your own config using Okaeri!
public class ConfigurationYaml extends AbstractOkaeriConfig {

    // Don't forget to exclude this field!
    @Exclude
    public static final ConfigurationYaml INSTANCE = createConfig(ConfigurationYaml.class, "config.yml"); // By default, framework will use YAML. See ConfigurationGson for GSON usage.

    // I recommend using Lombok
    public static ConfigurationYaml getInstance() {
        return INSTANCE;
    }


    public String someValue = "Hello, World!";

    public boolean someBoolean = true;
}
