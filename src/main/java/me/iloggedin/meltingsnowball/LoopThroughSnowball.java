package me.iloggedin.meltingsnowball;

import org.bukkit.Particle;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Snowball;




public class LoopThroughSnowball extends BukkitRunnable {
    Snowball s;
    @Override
    public void run() {
        for(Snowball s : s.getWorld().getEntitiesByClass(Snowball.class)){
            s.getWorld().spawnParticle(Particle.WARPED_SPORE,s.getLocation(), 100);

        }

    }
}
