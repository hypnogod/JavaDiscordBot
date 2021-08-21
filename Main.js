import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;

public class Main {
    private Main() throws LoginException{
        String Token = "";
        final JDA jda = new JDABuilder(AccountType.BOT)
                .setToken(Token).build();
    }
    public static void main(String[] args) throws LoginException {
        new Main();
    }
}
