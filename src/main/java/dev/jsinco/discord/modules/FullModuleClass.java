package dev.jsinco.discord.modules;

// A module class that includes every available module

import dev.jsinco.discord.framework.commands.DiscordCommand;
import dev.jsinco.discord.framework.scheduling.Tick;
import dev.jsinco.discord.framework.scheduling.Tickable;
import dev.jsinco.discord.framework.scheduling.TimeUnit;
import dev.jsinco.discord.framework.util.Module;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

// Module class includes CommandModule and ListenerModule
public class FullModuleClass extends Tickable implements Module {

    // You can write @DiscordCommand on your execute methods too!
    @DiscordCommand(name = "test", description = "A test command", guildOnly = false)
    @Override
    public void execute(SlashCommandInteractionEvent event) {
        event.reply("This is a test command").queue();
    }

    // You can write @Tick on your onTick methods too!
    @Tick(unit = TimeUnit.SECONDS, period = 500)
    @Override
    public void onTick() {
        System.out.println("This is a test tick");
    }

    @SubscribeEvent
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!test")) {
            event.getChannel().sendMessage("This is a test message").queue();
        }
    }

    @SubscribeEvent
    public void onEnable(ReadyEvent event) {
        System.out.println("This is a test onEnable");
    }
}
