package mp.gutischigami;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import static mp.gutischigami.Utils.MessageUtils.getColoredMessage;

public class PluginGMKN extends JavaPlugin {

    public static String prefix = "&3[&6GameModeDetector]";
    private final String version = getDescription().getVersion();

    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage(
                getColoredMessage(prefix + "ha sido iniciado, &cVersion " + version )
        );
    }

    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(
                getColoredMessage(prefix + "Gracias por utilizarme wapeton")
        );
    }

}