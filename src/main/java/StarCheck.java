import org.bukkit.plugin.java.JavaPlugin;

public class StarCheck extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info(getDescription().getName() + " was enabled!");

        getCommand("starcheck").setExecutor(new dantoc.commands.StarCheck());
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getName() + " was disabled!");
    }
}
