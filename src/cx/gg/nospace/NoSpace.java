package cx.gg.nospace;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSpace extends JavaPlugin implements Listener {
	//Check player names for spaces on login, don't allow them to join if they have one
	@EventHandler
	public void asyncOnPlayerPreLogin (AsyncPlayerPreLoginEvent event) {
		if (event.getName().contains(" ")) {
			event.disallow(Result.KICK_OTHER, "Your username contains a space, this can break some minecraft server plugins.");
		}
	}
	
	public void onEnable() { 
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	
}
