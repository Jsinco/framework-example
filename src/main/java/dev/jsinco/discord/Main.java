package dev.jsinco.discord;

import dev.jsinco.discord.consolecommands.TestConsoleCommand;
import dev.jsinco.discord.framework.FrameWork;
import dev.jsinco.discord.framework.console.ConsoleCommandManager;

public class Main {

    public static void main(String[] args) {
        // Start our FrameWork using all FrameWork defaults. All we need to provide is our caller class, so this class.
        FrameWork.start(Main.class);

        // Register our custom console command
        ConsoleCommandManager.getInstance()
                .registerCommand(new TestConsoleCommand());
    }
}