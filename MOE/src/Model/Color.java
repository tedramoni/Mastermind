package Model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum Color {

	//Objets directement construits

	Blue(0, "B"),
	Red(1, "R"),
	Yellow(2, "Y"),
	Green(3, "G");

	private int Number = 0;
	private String Character = "";

	//Constructeur

	Color(int number, String character){
		this.Number = number;
		this.Character = character;

	}

	private static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Color randomColor(){
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

	int getNumber(){
		return this.Number;
	}

	public String getColor(){
		return this.Character;
	}
}