package model;

/**
 * 
 * Classe abstraite Game
 *
 */
public abstract class Game {

	protected EnumGameState state;
	
	/**
	 * Constructeur sans param�tre
	 */
	public Game(){
		setState(EnumGameState.Created);
	}
	
	/**
	 * Getter de l'�tat du jeu
	 * @return state
	 */
	public abstract void initialisation();

	public EnumGameState getState() {
		return state;
	}

	/**
	 * R�cup�re l'�tat du jeu
	 * @param state l'�tat du jeu
	 */
	public void setState(EnumGameState state) {
		this.state = state;
	}
	
	/**
	 * Etat = victoire
	 * @return state = win donc partie gagn�e
	 */
	public boolean isWin(){
		return(state == EnumGameState.Win);
	}
	
	/**
	 * Etat = d�faite
	 * @return state = lost donc partie perdue
	 */
	public boolean isLoose(){
		return(state == EnumGameState.Lost);
	}
}
