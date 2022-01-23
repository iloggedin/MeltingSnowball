package github.iloggedin;
import org.bukkit.entity.Snowball;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.Particle;
public class Snowmelt implements Listener{

    public void snowWater(ProjectileLaunchEvent projectileLaunchEvent){
      if(projectileLaunchEvent.getEntity() instanceof Snowball s){
          s.getWorld().spawnParticle(Particle.WATER_DROP, s.getLocation(),100);
      }
    }
}
