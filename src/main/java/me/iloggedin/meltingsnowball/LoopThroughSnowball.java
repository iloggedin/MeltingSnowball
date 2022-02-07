package me.iloggedin.meltingsnowball;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Snowball;
public class LoopThroughSnowball extends BukkitRunnable {
    World world = Bukkit.getWorld("world");

    @Override
    public void run() {
        if (world == null) {
            return;
        }
        for (World world : Bukkit.getWorlds())
            for (Snowball s : world.getEntitiesByClass(Snowball.class)) {
                world.spawnParticle(Particle.WARPED_SPORE, s.getLocation(), 100);
            }
    }
}
