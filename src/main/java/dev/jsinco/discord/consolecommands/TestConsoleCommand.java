package dev.jsinco.discord.consolecommands;

import dev.jsinco.discord.framework.console.ConsoleCommand;
import dev.jsinco.discord.framework.logging.FrameWorkLogger;

// Make your own custom console commands!
// Console commands must be registered manually so be sure to check out the Main class.
public class TestConsoleCommand implements ConsoleCommand {
    @Override
    public String name() {
        return "testconsolecommand";
    }

    @Override
    public void execute(String[] args) {
        FrameWorkLogger.info("Test console command executed. Hi there!");
    }
}
