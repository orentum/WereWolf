package fr.wither.main;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Werewolf extends JavaPlugin{
	
	
	private static Werewolf instance;
	public FileConfiguration config = this.getConfig();
	
	
	public void onEnable() {
		instance = this;
		this.saveDefaultConfig();
		config.addDefault("Werewolf_name", "Loup-Garou");
		config.addDefault("Villager_name", "Paysan");
		config.addDefault("Activate Little-Girl", true);
		config.addDefault("Little_Girl_name", "Petite Fille");
		config.addDefault("Activate Witch", true);
		config.addDefault("Witch_name", "Sorcière");
		config.addDefault("Activate Oracle", true);
		config.addDefault("Oracle_name", "Voyante");
		config.addDefault("Activate Election-Launcher", true);
		config.addDefault("Election_Launcher_name", "Agitateur");
		config.addDefault("Activate Crazy", true);
		config.addDefault("Crazy_name", "Fou");
		config.addDefault("Activate Hunter", true);
		config.addDefault("Hunter_name", "Chasseur");
		config.addDefault("Activate Robber", true);
		config.addDefault("Robber_name", "Voleur");
		config.addDefault("Activate White-Werewolf", true);
		config.addDefault("White_Werewolf_name", "Loup Blanc");
		config.addDefault("Minimum players needed", 13);
		config.addDefault("Maximum players", 26);
		config.addDefault("Plugin Prefix", "WereWolf");
		config.addDefault("Waiting_Message", "En attente de joueurs, la partie démarrera lorsque nous aurons atteint le minimum de joueurs requis");
		config.addDefault("Wait_Time", 20);
		config.addDefault("Seconds Displaying", "secondes restantes");		
		//config.addDefault("MAX_HOME", 3);
		config.options().copyDefaults(true);
        saveConfig();
	}
	
	
	public static Werewolf getInstance() {
		return instance;
	}
	
	public void onDisable() {
		
	}
}
