package mp.gutischigami.Player;
import mp.gutischigami.PluginGMKN;
import mp.gutischigami.Utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import java.net.http.WebSocket;

public class PlayerListener implements WebSocket.Listener {

    private PluginGMKN plugin;

    public PlayerListener(PluginGMKN plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMode(PlayerGameModeChangeEvent event){
    Player player = event.getPlayer();
        if (player.getGameMode().equals(GameMode.CREATIVE)){
            Bukkit.getServer().broadcastMessage(MessageUtils.getColoredMessage("&cQue pasó &5 " + player.getName() + " &cme salió &d WEKEREKE?"));
        }
    }
}
