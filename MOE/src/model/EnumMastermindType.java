package model;

/**
 * 
 * @author Alexis Colonna
 * 
 * Enum des différents types de Mastermind
 * 
 * HvsH : humain contre humain
 * HvsIA : humain contre intelligence artificielle
 * HvsIAE : humain contre intelligence artificielle mode éléphant (sans historique)
 * HvsHE : humain contre humain mode éléphant (sans historique)
 *
 */
public enum EnumMastermindType {
	HvsH, HvsIA, HvsIAE, HvsHE, Rules, Quit
}
