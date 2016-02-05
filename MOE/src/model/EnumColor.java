package model;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe repr�sentant une couleur
 * 
 * @author Alexis Colonna
 *
 */
public enum EnumColor {

	//Objets directement construits

	Bleu(0, 'B'),
	Vert(1, 'V'),
	Jaune(2, 'J'),
	Rouge(3, 'R'),
	Orange(4, 'O'),
    Noir(5, 'N'),
    Marron(6, 'M'),
    Gris(7, 'G');

	private int Number = 0;
	private char Character = '.';

	

	/**
	 * Constructeur de l'enum
	 * 
	 * @param number num�ro repr�sentant la couleur � cr�er
	 * @param character lettre repr�sentant la couleur � cr�er
	 */
	EnumColor(int number, char character){
		this.Number = number;
		this.Character = character;

	}
	
	/**
	 * Constructeur de la couleur � partir d'une couleur pr�existante
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
	 * @return une couleur de type enumColor parmis celles stock�es dans la liste VALUES
	 */
	public static EnumColor randomEnumColor(){
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	/**
	 * Permet de r�cup�rer la liste des couleurs
	 * @return liste des couleurs
	 */
	public static List<EnumColor> allEnumColor(){
		return VALUES;
	}
	
	/**
	 * Permet de r�cup�rer une couleur � partir de la lettre qui la repr�sente
	 * @param c Lettre repr�sentant la couleur 
	 * @return La couleur demand�e si elle existe ou null
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
	 * @return Nombre rep�sentant la couleur
	 */
	int getNumber(){
		return this.Number;
	}
	
	/**
	 * 
	 * @return La lettre repr�sentant la couleur
	 */
	char getChar(){
		return this.Character;
	}
}