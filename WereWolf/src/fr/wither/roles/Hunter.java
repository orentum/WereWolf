package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class Hunter extends SpecialVillagers {
	
	private String nom = Werewolf.getInstance().config.getString("Hunter_name");
	
	public Hunter(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "Hunter");
	}

	public String getNom() {
		return nom;
	}
}
