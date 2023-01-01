package lordpipe.versionwarning;

import com.viaversion.viaversion.api.Via;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    private VersionWarning plugin;

    public JoinListener(VersionWarning pl) {
        plugin = pl;
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        int playerVersion = Via.getAPI().getPlayerVersion(event.getPlayer());

        String message = plugin.getConfig().getString("banned-versions." + playerVersion);
        if (message == null) return;
        else {
            event.getPlayer().kick(plugin.mm.deserialize(message));
        }

    }
}
