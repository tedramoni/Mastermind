package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.StringToCombinaison;

/**
 * 
 * Classe HumanMastermind pour décrire la combinaison donnée par le joueur humain
 *
 */
public class HumanMastermind extends PlayerMastermind {

	private BufferedReader in;
	private BufferedWriter out;

	private String pseudo = "DefaultHuman";

	/**
	 * Constructeur avec paramètre
	 * @param s paramètre pour le pseudo du joueur humain
	 */
	public HumanMastermind(String s) {
		this.pseudo = s;
		this.out = new BufferedWriter((new OutputStreamWriter(System.out)));
		this.in = new BufferedReader((new InputStreamReader(System.in)));
	}

	/**
	 * Recupère la combinaison donnée par le joueur humain
	 */
	@Override
	public Combinaison getCombinaison() throws IOException {
		String line = this.getString();	

		return StringToCombinaison.getCombinaison(line);

	}
	
/**
 * 
 * @return la string ecrite par l'utilisateur => mis en majuscule
 * @throws IOException
 */
	public String getString() throws IOException{
		return in.readLine().toUpperCase();	
	}

	/**
	 * Recupération du choix de partie de l'utilisateur
	 */
	@Override
	public EnumMastermindType choicePartie() throws IOException {
		String temp = in.readLine();
		try{
			int i = Integer.parseInt(temp);
			if(i==1)
				return EnumMastermindType.HvsH;
			else if(i==2)
				return EnumMastermindType.HvsIA;
			else if(i==3)
				return EnumMastermindType.HvsIAE;
			else if(i==4)
				return EnumMastermindType.HvsHE;
			else if(i==5)
				return EnumMastermindType.Rules;
			else if(i==4)
				return EnumMastermindType.Quit;
		}catch(NumberFormatException e){return null;}
		return null;

	}

}
