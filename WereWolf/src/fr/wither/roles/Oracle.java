package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class Oracle extends SpecialVillagers {
	
	
	private String nom = Werewolf.getInstance().config.getString("Oracle_name");
	
	public Oracle(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "Oracle");
	}

	public String getNom() {
		return nom;
	}

}
