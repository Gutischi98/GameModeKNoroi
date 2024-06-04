package mp.gutischigami.Player;

import mp.gutischigami.PluginGMKN;
import org.bukkit.entity.Player;

import java.net.http.WebSocket;

public class PlayerListener implements WebSocket.Listener {

    private PluginGMKN plugin;

    public PlayerListener(PluginGMKN plugin){
        this.plugin = plugin;
    }

}
