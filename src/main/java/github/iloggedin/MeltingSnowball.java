package github.iloggedin;

import org.bukkit.plugin.java.JavaPlugin;
public class MeltingSnowball extends JavaPlugin {


    public void onEnable() {
        getLogger().info("Plugin started");
        getServer().getPluginManager().registerEvents(new Snowmelt(), this);
    }


    public void onDisable() {
        getLogger().info("Plugin stopped");
    }
}

