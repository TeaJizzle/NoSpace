package cx.gg.nospace;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class NoSpace implements Listener {
	//Check player names for spaces on login, don't allow them to join if they have one
	public void asyncOnPlayerPreLogin (AsyncPlayerPreLoginEvent event) {
		if (event.getName().contains(" ")) {
			event.disallow(Result.KICK_OTHER, "Your username contains a space, this can break some minecraft server plugins.");
		}
	}
}
