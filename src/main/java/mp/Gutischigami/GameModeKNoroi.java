package mp.Gutischigami;
import mp.Gutischigami.Player.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import static mp.Gutischigami.Utils.MessageUtils.getColoredMessage;

public class GameModeKNoroi extends JavaPlugin {

    public static String prefix = "&3[&6GameModeDetectorNoroi]";
    private final String version = getDescription().getVersion();

    public void onEnable(){
        registerEvents();
        Bukkit.getConsoleSender().sendMessage(
                getColoredMessage(prefix + "ha sido iniciado, &cVersion " + version )
        );
    }

    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(
                getColoredMessage(prefix + "Gracias por utilizarme wapeton")
        );
    }

    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new PlayerListener(this),this);
    }

}
