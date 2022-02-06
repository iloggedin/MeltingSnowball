package github.iloggedin;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.ArrayList;
import java.util.List;


public class SnowBallThrowListener implements Listener {
    public List<Snowball> snowballList = new ArrayList<>();
    LoopThroughSnowball loop = new LoopThroughSnowball();

    @EventHandler
    public void onProjectileLaunchEvent(ProjectileLaunchEvent event){
      if(event.getEntity() instanceof Snowball s){
          loop.run();

      }

        //1 add snowball to the list when thrown
        //2 remove when hit something
        //3 create a scheduler task that runs every x times and loop through each one in the list and spawns a particle


    }
}
