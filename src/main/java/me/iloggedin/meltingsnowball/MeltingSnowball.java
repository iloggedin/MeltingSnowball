package me.iloggedin.meltingsnowball;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class MeltingSnowball extends JavaPlugin {

    @Override
    public void onEnable() {
        BukkitTask loopthroughsnowball = new LoopThroughSnowball().runTaskTimer(this, 0, 10);
    }
}

