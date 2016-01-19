package Converter;

import Model.Color;
import Model.Combinaison;

import java.util.ArrayList;


public class StringToCombinaison {


	private String saisie;
	private ArrayList<Color> TabCombinaison;
	private Combinaison Comb;


	public StringToCombinaison(String s){
		this.saisie = s.toUpperCase();
		this.TabCombinaison = new ArrayList<Color>();
	}
	
	public StringToCombinaison(Combinaison comb){
		this.Comb = comb;
	}

	public Combinaison conversion(){
		for(int i = 0; i < this.saisie.length(); i++){
			if(this.saisie.charAt(i)=='R')// pour le rouge
				this.TabCombinaison.add(i, Color.Red);
			else if(this.saisie.charAt(i)=='B')//pour le bleu
				this.TabCombinaison.add(i, Color.Blue);
			else if(this.saisie.charAt(i)=='V')//pour le vert
				this.TabCombinaison.add(i, Color.Green);
			else if(this.saisie.charAt(i)=='J')//pour le jaune
				this.TabCombinaison.add(i, Color.Yellow);
		}

		return new Combinaison(this.TabCombinaison);

	}
}
