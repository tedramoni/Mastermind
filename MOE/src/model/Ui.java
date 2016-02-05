package model;
import java.io.IOException;


/**
 * 
 * @author Alexis Colonna
 * 
 * Classe abstraite gérant les affichages
 *
 */
public abstract class Ui {
	
	// protected PrintWriter out;
	
	 public abstract void display(EnumEvent event) throws IOException;
}
