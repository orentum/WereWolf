package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class LittleGirl extends SpecialVillagers{
	
	private String nom = Werewolf.getInstance().config.getString("Little_Girl_name");
	public LittleGirl(UUID uuid, Player joueur) {
		super(uuid, joueur,"LittleGirl");
	}

	public String getNom() {
		return nom;
	}
	
	
}
