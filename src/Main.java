package random.bot.hypno;


import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class Main {
    // anything that starts with constant is in Constant.java file
    private Main() throws LoginException, InterruptedException{
        Constant constant = new Constant();
        JDA jda = JDABuilder.createDefault(constant.Token)
                .addEventListeners(new Listener())
                .setStatus(OnlineStatus.IDLE)
                .setActivity(Activity.playing(constant.Activity))
                .build();
    }
    public static void main(String[] args) throws LoginException, InterruptedException {
        new Main();
    }
}
