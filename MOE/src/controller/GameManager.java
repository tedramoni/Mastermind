package controller;
import java.io.IOException;

/**
 * 
 * @author Alexis Colonna
 * Classe abstraite de gestion du jeu
 */
public abstract class GameManager {
	/*protected Ui ui;
	protected Game game;*/
	
	public abstract void play() throws IOException, InterruptedException;
	public abstract void init() throws IOException, InterruptedException;
	public abstract void quit(int status) throws IOException;
}
