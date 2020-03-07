package zig.us.WorldDamage;

import org.bukkit.plugin.java.JavaPlugin;


public class WorldDamage extends JavaPlugin {


    @Override
    public void onEnable() {

        //getCommand("worlddamage").setExecutor(new Base());

        //Implementing EventListener
        getServer().getPluginManager().registerEvents(new EventListener(), this);

    }

    @Override
    public void onDisable() {

    }
}
