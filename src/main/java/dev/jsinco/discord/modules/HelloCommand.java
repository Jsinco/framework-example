package dev.jsinco.discord.modules;

import dev.jsinco.discord.framework.commands.CommandModule;
import dev.jsinco.discord.framework.commands.DiscordCommand;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.List;

// CommandModules must contain the @DiscordCommand annotation.
@DiscordCommand(name = "hello", description = "Says hello!", permission = Permission.ADMINISTRATOR, guildOnly = true)
public class HelloCommand implements CommandModule {
    @Override
    public void execute(SlashCommandInteractionEvent event) {
        event.reply("Hello!").queue();
    }

    // Add your own args!
    @Override
    public List<OptionData> getOptions() {
        return List.of(
                new OptionData(OptionType.MENTIONABLE, "name", "The name to say hello to.", false)
        );
    }

    // Persist registration? Useful for if you want your arguments to update periodically.
    @Override
    public boolean persistRegistration() {
        return false;
    }
}
