package lordpipe.versionwarning;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import net.kyori.adventure.text.minimessage.MiniMessage;

import java.util.List;

import com.viaversion.viaversion.api.Via;

/**
 * Plugin to annoy the user to update.
 *
 * @author Copyright (c) lordpipe. Licensed GPLv3
 */
public class VersionWarning extends JavaPlugin {
    public MiniMessage mm = MiniMessage.miniMessage();

    @Override
    public void onEnable() {
        saveDefaultConfig();

        List<Integer> badVersions = getConfig().getIntegerList("bad-versions");
        String preferredVersion = getConfig().getString("preferred-version");
        long warningPeriod = getConfig().getLong("warning-period");

        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                int playerVersion = Via.getAPI().getPlayerVersion(player.getUniqueId());

                if (badVersions.contains(playerVersion)) {
                    player.sendMessage(mm.deserialize(
                        "<#ee9198>===============================================\n<#e76872>You are logged in using an unsupported version.\nYour experience may be degraded when using this version.\nSwitch to " + preferredVersion + " for optimal experience.\n<#ee9198>==============================================="));
                }
            }
        }, 0, warningPeriod);

        getServer().getPluginManager().registerEvents(new JoinListener(this), this);
    }

}
