package model;
import java.io.IOException;

public abstract class Ui {
	
	// protected PrintWriter out;
	
	 public abstract void display(EnumEvent event) throws IOException;
}
