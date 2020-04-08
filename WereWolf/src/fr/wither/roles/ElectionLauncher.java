package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class ElectionLauncher extends SpecialVillagers {
	
	
	private String nom = Werewolf.getInstance().config.getString("Election_Launcher_name");

	public ElectionLauncher(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "ElectionLauncher");
	}

	public String getNom() {
		return nom;
	}

}
