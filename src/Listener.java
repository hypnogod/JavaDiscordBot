package random.bot.hypno;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import javax.annotation.Nonnull;

public class Listener extends ListenerAdapter {
    Constant constant = new Constant();

    @Override
    public void onReady(@Nonnull ReadyEvent event) {
        System.out.println(event.getJDA().getSelfUser().getAsTag() + " is online");
    }

    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        if (args[0].equalsIgnoreCase(constant.Prefix + "help")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Commands");
            info.setColor(0x000000);
            info.setDescription("Only command we have is ~help");
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
    }
}
