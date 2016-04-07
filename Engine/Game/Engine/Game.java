package Engine;

import java.util.ArrayList;
import java.util.List;

// Represents an active game - base class
class Game {
	private GamePhase gamePhase = null;
	private Player[] players;
	public Supply supply = new Supply();
	
	public Player[] getPlayers() {
		return players;
	}
	
	public Game(Player[] players, GamePhase gamePhase) {
		this.players = players;
		this.gamePhase = gamePhase;
	}
}

enum GamePhase {
	ACTION_PHASE,
	BUY_PHASE,
	CLEANUP_PHASE
}