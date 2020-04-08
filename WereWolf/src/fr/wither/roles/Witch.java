package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class Witch extends SpecialVillagers {
	
	private String nom = Werewolf.getInstance().config.getString("Witch_name");

	public Witch(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "Witch");	
	}

	public String getNom() {
		return nom;
	}

}
