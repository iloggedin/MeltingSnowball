package me.iloggedin;

import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import static me.iloggedin.SnowBallThrowListener.snowballList;

public class SnowBallHitListener implements Listener {
      LoopThroughSnowball loop = new LoopThroughSnowball();

    //when a snowball hits something
    @EventHandler
    public void onHitEvent(ProjectileHitEvent hitEvent){
          if(hitEvent.getEntity() instanceof Snowball s){
            snowballList.remove(s);
             loop.cancel();
          }
     }

}
