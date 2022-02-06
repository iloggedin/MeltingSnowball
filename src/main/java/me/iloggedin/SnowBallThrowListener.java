package me.iloggedin;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import java.util.ArrayList;
import java.util.List;


public class SnowBallThrowListener implements Listener {
    public List<Snowball> snowballList = new ArrayList<>();
    LoopThroughSnowball loop = new LoopThroughSnowball();
    //if a snowball is thrown
    @EventHandler
    public void onProjectileLaunchEvent(ProjectileLaunchEvent event){
      if(event.getEntity() instanceof Snowball s){
          snowballList.add(s);
          loop.run();

      }




    }
}
