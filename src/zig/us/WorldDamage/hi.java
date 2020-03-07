package zig.us.WorldDamage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.concurrent.ThreadLocalRandom;


public class hi implements CommandExecutor {

     // Setting ints
     int iRandomNum = 0;
     int min = 1;
     int max = 6;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            //Sets a random int and sends one of the messages
            iRandomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

            //Selects the random int
            if (iRandomNum == 1) {
                player.sendMessage("Hi " + sender.getName() + ".");
            } else if (iRandomNum == 2) {
                player.sendMessage("Who do you think you are, doing /hi?");
            } else if (iRandomNum == 3) {
                player.sendMessage("Hello, how are you " + sender.getName() + "?");
            } else if (iRandomNum == 4) {
                player.sendMessage("Hola " + sender.getName() + ".");
            } else if (iRandomNum == 5) {
                player.sendMessage("Good Morning! (I don't care if it's not the morning where you are and if you get out (don't acually)");
            } else if (iRandomNum == 6) {
                player.sendMessage("Well done, you found the secret easter egg. Plugin made by bugzigus to be used on IronBorn");
            }

        }

        return false;
    }
}
