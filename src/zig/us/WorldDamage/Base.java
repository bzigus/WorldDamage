package zig.us.WorldDamage;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Base implements CommandExecutor {

    public boolean enabled = true;
    private boolean lastEnabled = false;
    public boolean debug = false;
    private boolean lastdubug = true;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {

        if (alias.equalsIgnoreCase("WorldDamage")) {

            if (args.length == 0) {

                sender.sendMessage("Damage Status: " + enabled);
                sender.sendMessage(ChatColor.RED + "No args found");
                sender.sendMessage("/worlddamage enable - Enabling/disabling the plugin");
                sender.sendMessage("/worlddamage Debug - See if the plugin is working");

            } else {

                if (args[0].equalsIgnoreCase("debug")) {

                    if (lastdubug == false) {
                        debug = true;
                    } else if (lastdubug){
                        debug = false;
                    }
                    sender.sendMessage("Debug changed to " + debug);
                    lastdubug = debug;

                } else if (args[0].equalsIgnoreCase("enable ")) {

                    if (lastEnabled == false) {

                        enabled = true;

                    } else if (lastEnabled){

                        enabled = false;

                    }
                    sender.sendMessage("Enabled changed to " + debug);

                    lastEnabled = enabled;

                }


                else {

                    sender.sendMessage(ChatColor.RED + "Did not recognize that term: " + args[0]);

                }

            }

        }

        return false;
    }
}
