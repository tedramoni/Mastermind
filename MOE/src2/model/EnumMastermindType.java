package model;

/**
 * 
 * @author Alexis Colonna
 * 
 * Enum des diff�rents types de Mastermind
 * 
 * HvsH : humain contre humain
 * HvsIA : humain contre intelligence artificielle
 * HvsIAE : humain contre intelligence artificielle mode �l�phant (sans historique)
 * HvsHE : humain contre humain mode �l�phant (sans historique)
 *
 */
public enum EnumMastermindType {
	HvsH, HvsIA, HvsIAE, HvsHE, Rules, Quit
}
