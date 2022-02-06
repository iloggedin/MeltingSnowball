package me.iloggedin;



import org.bukkit.Particle;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.Snowball;


public class LoopThroughSnowball extends BukkitRunnable {
    SnowBallThrowListener throwListener = new SnowBallThrowListener();
    @Override
    public void run() {
        for(Snowball s : throwListener.snowballList){
            s.getWorld().spawnParticle(Particle.WATER_SPLASH, s.getLocation(), 4);
        }
        // add snowball to the list when thrown
        // remove when hit something
        // create a scheduler task that runs every x times and loop through each one in the list and spawns a particle
    }
}
