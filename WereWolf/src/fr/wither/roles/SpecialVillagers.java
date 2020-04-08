package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

public class SpecialVillagers {
	private UUID uuidJoueur;
	private Player joueur;
	private String role;
	
	public SpecialVillagers(UUID uuidJoueur, Player joueur, String role) {
		this.uuidJoueur = uuidJoueur;
		this.joueur = joueur;
		this.role = role;
	}

	public UUID getUuidJoueur() {
		return uuidJoueur;
	}

	public Player getJoueur() {
		return joueur;
	}

	public String getRole() {
		return role;
	}
	
}
