package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class Robber extends SpecialVillagers {
	
	private String nom = Werewolf.getInstance().config.getString("Robber_name");

	public Robber(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "Robber");
	}

	public String getNom() {
		return nom;
	}

}
