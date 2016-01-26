import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum EnumColor {

	//Objets directement construits

	Blue(0, 'B'),
	Red(1, 'R'),
	Yellow(2, 'Y'),
	Green(3, 'G');

	private int Number = 0;
	private char Character = '.';

	//Constructeur

	EnumColor(int number, char character){
		this.Number = number;
		this.Character = character;

	}
	
	EnumColor(EnumColor c){
		this.Number = c.getNumber();
		this.Character =c.getChar();

	}


	private static final List<EnumColor> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static EnumColor randomEnumColor(){
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	public static List<EnumColor> allEnumColor(){
		return VALUES;
	}
	
	public static EnumColor getEnumColorWithChar(char c){
		for (EnumColor EnumColor : VALUES) {
			if(EnumColor.getChar() == c){
				return EnumColor;
			}
		}
		return null;
	}

	int getNumber(){
		return this.Number;
	}
	
	char getChar(){
		return this.Character;
	}
}