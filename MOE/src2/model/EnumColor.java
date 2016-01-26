package model;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe représentant une couleur
 * 
 * @author Alexis Colonna
 *
 */
public enum EnumColor {

	//Objets directement construits

	Blue(0, 'B'),
	Red(1, 'R'),
	Yellow(2, 'Y'),
	Green(3, 'G');

	private int Number = 0;
	private char Character = '.';

	

	/**
	 * Constructeur de l'enum
	 * 
	 * @param number numéro représentant la couleur à créer
	 * @param character lettre représentant la couleur à créer
	 */
	EnumColor(int number, char character){
		this.Number = number;
		this.Character = character;

	}
	
	/**
	 * Constructeur de la couleur à partir d'une couleur préexistante
	 * 
	 * @param c Une instance d'EnumColor
	 */
	EnumColor(EnumColor c){
		this.Number = c.getNumber();
		this.Character =c.getChar();

	}


	private static final List<EnumColor> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	/**
	 * Permet de choisir une couleur au hasard
	 * @return une couleur de type enumColor parmis celles stockées dans la liste VALUES
	 */
	public static EnumColor randomEnumColor(){
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	/**
	 * Permet de récupérer la liste des couleurs
	 * @return liste des couleurs
	 */
	public static List<EnumColor> allEnumColor(){
		return VALUES;
	}
	
	/**
	 * Permet de récupérer une couleur à partir de la lettre qui la représente
	 * @param c Lettre représentant la couleur 
	 * @return La couleur demandée si elle existe ou null
	 */
	public static EnumColor getEnumColorWithChar(char c){
		for (EnumColor EnumColor : VALUES) {
			if(EnumColor.getChar() == c){
				return EnumColor;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return Nombre repésentant la couleur
	 */
	int getNumber(){
		return this.Number;
	}
	
	/**
	 * 
	 * @return La lettre représentant la couleur
	 */
	char getChar(){
		return this.Character;
	}
}