package model;

/**
 * 
 * Classe abstraite Game
 *
 */
public abstract class Game {

	protected EnumGameState state;
	
	/**
	 * Constructeur sans paramètre
	 */
	public Game(){
		setState(EnumGameState.Created);
	}
	
	/**
	 * Getter de l'état du jeu
	 * @return state
	 */
	public abstract void initialisation();

	public EnumGameState getState() {
		return state;
	}

	/**
	 * Récupère l'état du jeu
	 * @param state l'état du jeu
	 */
	public void setState(EnumGameState state) {
		this.state = state;
	}
	
	/**
	 * Etat = victoire
	 * @return state = win donc partie gagnée
	 */
	public boolean isWin(){
		return(state == EnumGameState.Win);
	}
	
	/**
	 * Etat = défaite
	 * @return state = lost donc partie perdue
	 */
	public boolean isLoose(){
		return(state == EnumGameState.Lost);
	}
}
