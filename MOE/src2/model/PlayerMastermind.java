package model;
import java.io.IOException;


public abstract class PlayerMastermind {
	
	public abstract Combinaison getCombinaison() throws IOException;
	public abstract EnumMastermindType choicePartie() throws IOException;
	

}