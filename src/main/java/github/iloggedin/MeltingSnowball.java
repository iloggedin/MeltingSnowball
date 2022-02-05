package github.iloggedin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class MeltingSnowball extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SnowBallThrowListener(), this);

        BukkitTask loopthroughsnowball = new LoopThroughSnowball().runTaskTimer(this, 100L, 10);
    }
}

