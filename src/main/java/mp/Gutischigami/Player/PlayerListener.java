package mp.Gutischigami.Player;
import mp.Gutischigami.GameModeKNoroi;
import mp.Gutischigami.Utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;


public class PlayerListener implements Listener {

    private GameModeKNoroi plugin;

    public PlayerListener(GameModeKNoroi plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMode(PlayerGameModeChangeEvent event){
    Player player = event.getPlayer();
        if (!player.getGameMode().equals(GameMode.CREATIVE)){
            Bukkit.getServer().broadcastMessage(MessageUtils.getColoredMessage("&cQue pasó &5 " + player.getName() + " &cme salió &d WEKEREKE?"));
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        List<String> message = new ArrayList<>();
        message.add(ChatColor.AQUA + "------------------------");
        message.add("");
        message.add(ChatColor.WHITE + "Bienvenido! " + ChatColor.DARK_PURPLE + player.getName() + ChatColor.WHITE + " al servidor");
        message.add(ChatColor.BLUE + "Pasalo joya");
        message.add("");
        message.add(ChatColor.AQUA + "------------------------");

        for (String m : message){
            Bukkit.getServer().broadcastMessage(m);
        }

       // Bukkit.getServer().broadcastMessage("/title @a title [\"\",{\"text\":\"a\",\"obfuscated\":true},\" \",{\"text\":\"[\",\"color\":\"dark_purple\"},\" \",{\"text\":\"Bienvenido\",\"bold\":true,\"color\":\"aqua\"},\" \",{\"text\":\"]\",\"color\":\"dark_purple\"},\" \",{\"text\":\"a\",\"obfuscated\":true}]");
    }


}
