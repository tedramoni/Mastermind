package Controller;

import Model.*;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Controller {

	private int typePartie = 0;
	private GameState MastermindState = GameState.STOPPED;
	private Game Mastermind;
	private Player cachotier;
	private Player devin;
	private Combinaison source;
	private ArrayList<Combinaison> historique = new ArrayList<Combinaison>();


	public Controller(int type) {
		this.typePartie = type;

	}

	public void startMastermind() {
		this.MastermindState = GameState.STARTED;
		this.Mastermind = new Game();

		if (this.typePartie == 1) { //Joueur éel
			this.devin = new Humain();
			this.cachotier = new Humain();// on céée le joueur humain
			this.Mastermind.setCombinaison(this.source = this.cachotier.getCombinaison());//on lui demande la combinaison
			this.Mastermind.setNbTryMax(this.cachotier.getTryMax());//on lui demande le nombre d'essai max

			Combinaison proposition;
			Comparaison comparaison;


			while (this.MastermindState != GameState.WIN && this.MastermindState != GameState.LOST) {

				proposition = devin.getCombinaison();
				historique.add(proposition);
				comparaison = Mastermind.tryCombinaison(proposition);
				
				// afficher la comparaison
				if (comparaison.getBlack() == comparaison.getSize()) {
					this.win();
				} else {
					this.afficherHistorique();
					System.out.println("Vous avez " + comparaison.getBlack() + " pions bien placés et " + comparaison.getWhite() + " bonnes couleurs ");
					if (!Mastermind.isThereTryLeft()) {
						this.lost();
					}

				}
			}
			
			
			
		} else if (this.typePartie == 2) {

			this.devin = new Humain();
			this.cachotier = new Ia(); // on céée l'IA
			this.Mastermind.setCombinaison(cachotier.getCombinaison());//on lui demande la combinaison
			this.Mastermind.setNbTryMax(this.cachotier.getTryMax());//on lui demande le nombre d'essai max

			Combinaison proposition;
			Comparaison comparaison;


			while (this.MastermindState != GameState.WIN && this.MastermindState != GameState.LOST) {

				proposition = devin.getCombinaison();
				historique.add(proposition);
				comparaison = Mastermind.tryCombinaison(proposition);

				// afficher la comparaison
				if (comparaison.getBlack() == comparaison.getSize()) {
					this.win();
				} else {
					this.afficherHistorique();
					System.out.println("Vous avez " + comparaison.getBlack() + " pions bien placés et " + comparaison.getWhite() + " bonnes couleurs ");
					if (!Mastermind.isThereTryLeft()) {
						this.lost();
					}

				}
			}
		}


	}

	public void afficherHistorique() {
		int i = 1;
		for (Combinaison comb : historique) {
			System.out.print(i + " - "  );
			comb.afficherCombinaison();
			System.out.println();
			i++;
		}
	}
	
	public void win() {
		this.MastermindState = GameState.WIN;
		System.out.println("Le joueur qui devine a gagné ! ");
	}

	public void lost() {
		this.MastermindState = GameState.LOST;
		System.out.println("Le joueur qui devine a perdu ! ");
	}

}