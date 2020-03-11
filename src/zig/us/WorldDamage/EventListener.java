package zig.us.WorldDamage;

//Imports
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;
import zig.us.WorldDamage.Base.*;

public class EventListener implements Listener {



    @EventHandler

    //Player move event
    public void onPlayerMove (PlayerMoveEvent event) {
        //if (new Base().enabled == true) {


            //If in nether
            if (event.getPlayer().getLocation().getWorld().getName().contains("nether")) {

                // and has doesn't have luck
                if (event.getPlayer().hasPotionEffect(PotionEffectType.LUCK) == false) {

                    //Deal Damage
                    event.getPlayer().damage(0);
                    event.getPlayer().setFireTicks(5);

                }
            }

            //If in nether
            if (event.getPlayer().getLocation().getWorld().getName().contains("end")) {

                // and doesn't have Night_Vision
                if (event.getPlayer().hasPotionEffect(PotionEffectType.NIGHT_VISION) == false) {

                    //Deal Damage
                    event.getPlayer().damage(1);

                }
            }
        //}
    }
}
