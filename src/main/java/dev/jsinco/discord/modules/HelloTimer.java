package dev.jsinco.discord.modules;

import dev.jsinco.discord.framework.logging.FrameWorkLogger;
import dev.jsinco.discord.framework.scheduling.Tick;
import dev.jsinco.discord.framework.scheduling.Tickable;
import dev.jsinco.discord.framework.scheduling.TimeUnit;

// Prints out hello on a timer

// Tickable modules must be annotated with @Tick
@Tick(unit = TimeUnit.MINUTES, period = 5)
public class HelloTimer extends Tickable {
    @Override
    public void onTick() {
        FrameWorkLogger.info("Hello!");
    }
}
