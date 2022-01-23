package github.iloggedin;

import org.bukkit.plugin.java.JavaPlugin;
public class MeltingSnowball extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SnowBallThrowListener(), this);
    }


}

