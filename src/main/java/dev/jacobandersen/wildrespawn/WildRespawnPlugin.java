package dev.jacobandersen.wildrespawn;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WildRespawnPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        Player p = event.getPlayer();
        if (p.getBedSpawnLocation() == null) {
            p.performCommand("/wild"); // you could make this a config option or if the wild plugin has an API use that instead (latter is better option)
        }
    }
}
