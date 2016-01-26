package model;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Ui {
	
	// protected PrintWriter out;
	
	 public abstract void display(EnumEvent event) throws IOException;
}
