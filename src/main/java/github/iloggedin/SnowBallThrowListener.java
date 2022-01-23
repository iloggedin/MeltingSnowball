package github.iloggedin;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.Particle;
public class SnowBallThrowListener implements Listener{

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event){
      if(event.getEntity() instanceof Snowball s){
          s.getWorld().spawnParticle(Particle.WATER_DROP, s.getLocation(),100);
      }
    }
}
