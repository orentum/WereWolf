package fr.wither.roles;

import java.util.UUID;

import org.bukkit.entity.Player;

import fr.wither.main.Werewolf;

public class WhiteWerewolf extends SpecialVillagers {
	
	private String nom = Werewolf.getInstance().config.getString("White_Werewolf_name");

	public WhiteWerewolf(UUID uuidJoueur, Player joueur) {
		super(uuidJoueur, joueur, "WhiteWerewolf");
	}

	public String getNom() {
		return nom;
	}

}
