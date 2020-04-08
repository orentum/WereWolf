package fr.wither.gameUtils.Listeners;



import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

import fr.wither.gameUtils.AliveManager;
import fr.wither.main.Werewolf;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class PlayerJoin implements Listener {
	int totalPlayer = Bukkit.getOnlinePlayers().size();
	int minimumRequired = Werewolf.getInstance().config.getInt("Minimum players needed");
	int maxAuthorized = Werewolf.getInstance().config.getInt("Maximum players");
	int waitTime = Werewolf.getInstance().config.getInt("Wait_Time") * 20;
	String bcPrefix = Werewolf.getInstance().config.getString("Plugin Prefix");
	String waitMessage = Werewolf.getInstance().config.getString("Waiting_Message");
	String secondDisplay = Werewolf.getInstance().config.getString("Seconds Displaying");

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		int LocalTime = waitTime / 20;
		Player player = e.getPlayer();

		if (totalPlayer <= minimumRequired) {
			Bukkit.broadcastMessage("§7[§6" + bcPrefix + "§7]§a" + waitMessage);
		}

		AliveManager.waiting.add(player.getUniqueId());

		if (totalPlayer >= minimumRequired) {
			Bukkit.getScheduler().runTaskTimer(Werewolf.getInstance(), new Runnable() {
				
				int time = LocalTime;

				@Override
				public void run() {
					if (this.time == 0)
	                {
						AliveManager.waiting.clear();
						//double rand = Math.random()*100;
	                    return;
	                }
	               
	                for (final Player player : Bukkit.getOnlinePlayers())
	                {
	                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(time + " " + secondDisplay));
	                }
	               
	                this.time--;
					
				}
				
			}, 0L, 20L);
		}
	}

	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		if (totalPlayer >= maxAuthorized) {
			e.disallow(Result.KICK_FULL, ChatColor.RED + "La partie est complete");
		}

	}

}
