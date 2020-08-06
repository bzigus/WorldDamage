package zig.us.WorldDamage;

//Imports
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;
import zig.us.WorldDamage.Base.*;

import java.util.Timer;

public class EventListener implements Listener {



    public void test (InventoryClickEvent)

    @EventHandler

    // if changed to
    public void onPlayerChangeWorld (PlayerChangedWorldEvent event) {

        event.getPlayer().setFireTicks(0);

    }

    Timer stime = Timer tim

    @EventHandler

    //Player move event
    public void onPlayerMove (PlayerMoveEvent event) {

        if (event.getPlayer().hasPermission("worlddamage.staff") == false) {

            //If in nether
            if (event.getPlayer().getLocation().getWorld().getName().contains("nether")) {

                // and has doesn't have luck
                if (event.getPlayer().hasPotionEffect(PotionEffectType.LUCK) == false) {

                    //Deal Damage
                    event.getPlayer().setFireTicks(1000);


                }
            }

            //If in nether
            if (event.getPlayer().getLocation().getWorld().getName().contains("end")) {

                // and doesn't have Night_Vision
                if (event.getPlayer().hasPotionEffect(PotionEffectType.NIGHT_VISION) == false) {

                    //Deal Damage
                    event.getPlayer().damage(3);

                }
            }
        }
    }
}
