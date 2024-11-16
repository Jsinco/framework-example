package dev.jsinco.discord.modules;

import dev.jsinco.discord.framework.events.ListenerModule;
import dev.jsinco.discord.framework.logging.FrameWorkLogger;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.SubscribeEvent;

public class HelloEvent implements ListenerModule {

    @SubscribeEvent
    public void onMessageReceived(MessageReceivedEvent event) {
        FrameWorkLogger.info("Received a message event.");

        if (event.getAuthor().isBot()) return;

        String messageContent = event.getMessage().getContentStripped();

        if (messageContent.equalsIgnoreCase("hi")) {
            event.getChannel().sendMessage("Hello " + event.getAuthor().getName() + "!").queue();
            FrameWorkLogger.info("Message content: " + messageContent);
        }
    }
}
