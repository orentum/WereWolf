package fr.wither.gameUtils;

import java.util.HashSet;
import java.util.UUID;

public class AliveManager {
	

	public static HashSet<UUID> alive = new HashSet<UUID>();
	public static HashSet<UUID> dead = new HashSet<UUID>();
	public static HashSet<UUID> waiting = new HashSet<UUID>();

}
