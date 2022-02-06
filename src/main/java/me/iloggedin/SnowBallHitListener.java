package me.iloggedin;

import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class SnowBallHitListener implements Listener {
      SnowBallThrowListener throwListener = new SnowBallThrowListener();

    //when a snowball hits something
    @EventHandler
    public void onHitEvent(ProjectileHitEvent hitEvent){
          if(hitEvent.getEntity() instanceof Snowball s){
            throwListener.snowballList.remove(s);
          }
     }

}
