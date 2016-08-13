package bot;

import com.Yuhan.Main;
import sx.blah.discord.api.events.*;
import sx.blah.discord.handle.impl.events.*;
import sx.blah.discord.util.*;

/**
 * Created by Yuhan on 8/13/16.
 */
public class Bot {

    @EventSubscriber
    public void onReady(ReadyEvent event) {
        System.out.println("Connected");
        try {
            Main.client.changeUsername("Test bot");
        } catch(RateLimitException | DiscordException e) {
            e.printStackTrace();
        }

    }

    @EventSubscriber
    public void onMessageReceivedEvent(MessageReceivedEvent event) {
        try {
            new MessageBuilder(Main.client).withChannel(event.getMessage().getChannel()).withContent(event.getMessage().getContent()).build();
        } catch (DiscordException | RateLimitException | MissingPermissionsException e) {
            e.printStackTrace();
        }
    }

}
