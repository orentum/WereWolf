package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class Crazy extends SpecialVillagers {
	
	private String nom = Werewolf.getInstance().config.getString("Crazy_name");
	
	public Crazy(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "Crazy");
	}

	public String getNom() {
		return nom;
	}	
}
