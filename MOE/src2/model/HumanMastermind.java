package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.StringToCombinaison;


public class HumanMastermind extends PlayerMastermind {

	private BufferedReader in;
	private BufferedWriter out;
	
	private String pseudo = "DefaultHuman";
	
	public HumanMastermind(String s) {
		this.pseudo = s;
		this.out = new BufferedWriter((new OutputStreamWriter(System.out)));
		this.in = new BufferedReader((new InputStreamReader(System.in)));
	}
	
	@Override
	public Combinaison getCombinaison() throws IOException {
		out.write(this.pseudo + "  Get Write Combinaison");
		String line = this.getString();	
		return StringToCombinaison.getCombinaison(line);
		
	}
	
	public String getString() throws IOException{
		return in.readLine();	
	}

}
