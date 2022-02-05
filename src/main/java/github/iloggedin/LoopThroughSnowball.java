package github.iloggedin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Snowball;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class LoopThroughSnowball extends BukkitRunnable{

    @Override
    public void run() {
        Bukkit.broadcastMessage("hello, this is a test");
        cancel();
    }
}
//3 create a scheduler task that runs every x times and loop through each one in the list and spawns a particle