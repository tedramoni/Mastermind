package model;
import java.io.IOException;

/**
 * 
 * @author Alexis Colonna
 * 
 * Classe abstraite donnant les fonctions que peut faire le joueur :
 * 
 * recup�rer la combinaison
 * choix de partie
 *
 */
public abstract class PlayerMastermind {
	
	public abstract Combinaison getCombinaison() throws IOException;
	public abstract EnumMastermindType choicePartie() throws IOException;
	public abstract boolean waitInput() throws IOException;

	}