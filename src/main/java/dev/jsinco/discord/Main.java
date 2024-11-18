package dev.jsinco.discord;

import dev.jsinco.discord.consolecommands.TestConsoleCommand;
import dev.jsinco.discord.files.ConfigurationYaml;
import dev.jsinco.discord.framework.FrameWork;
import dev.jsinco.discord.framework.console.ConsoleCommandManager;
import dev.jsinco.discord.framework.reflect.InjectStatic;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;

import java.nio.file.Path;

public class Main {

    @InjectStatic(FrameWork.class)
    private static JDA jda;

    public static void main(String[] args) {
        // Start our FrameWork using all FrameWork defaults. All we need to provide is our caller class, so this class.
        Path path = Path.of("C:\\Users\\jonah\\idea\\framework-example\\build\\libs\\test");
        FrameWork.start(Main.class, path);

        // Register our custom console command
        ConsoleCommandManager.getInstance()
                .registerCommand(new TestConsoleCommand());

        // set our own JDA presence
        jda.getPresence().setActivity(Activity.playing("With Jsinco/jda-framework"));

        ConfigurationYaml.getInstance().testSection.someBoolean = false;
        ConfigurationYaml.getInstance().save();

    }

}