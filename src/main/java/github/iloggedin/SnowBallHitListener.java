package github.iloggedin;


import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class SnowBallHitListener extends ProjectileHitEvent implements Listener {
      SnowBallThrowListener snowBallThrowListener = new SnowBallThrowListener();

    public SnowBallHitListener(Projectile projectile) {
        super(projectile);
    }


    @EventHandler
    public void onHitEvent(ProjectileHitEvent hitEvent){
          if(hitEvent.getEntity() instanceof Snowball s){
            snowBallThrowListener.snowballList.remove(s);
          }

     }


     //1 add snowball to the list when thrown
    //2 remove when hit something
    //3 create a scheduler task that runs every x times and loop through each one in the list and spawns a particle
}
