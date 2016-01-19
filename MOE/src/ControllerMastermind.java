import java.util.ArrayList;


public class ControllerMastermind {

	private int typePartie = 0;
	private GameState MastermindState = GameState.stopped;
	private GameMastermind Mastermind;
	private MastermindPlayer cachotier;
	private MastermindPlayer devin;
	private Combinaison source;

	public ControllerMastermind(int type) {
		this.typePartie = type;

	}

	public void startMastermind() {
		this.MastermindState = GameState.started;
		this.Mastermind = new GameMastermind();

		if (this.typePartie == 1) { //Joueur réel
			this.devin = new HumainMastermindPlayer();
			this.cachotier = new HumainMastermindPlayer();// on crée le joueur humain
			this.Mastermind.setCombinaison(this.source = this.cachotier.getCombinaison());//on lui demande la combinaison
			this.Mastermind.setNbTryMax(this.cachotier.getTryMax());//on lui demande le nombre d'essai max

			Combinaison proposition;
			Comparaison comparaison;


			while (this.MastermindState != GameState.win && this.MastermindState != GameState.lost) {

				proposition = devin.getCombinaison();
				comparaison = Mastermind.tryCombinaison(proposition);
				
				// afficher la comparaison
				if (comparaison.getBlack() == comparaison.getSize()) {
					this.win();
				} else {
					System.out.println("Vous avez " + comparaison.getBlack() + " pions bien placés et " + comparaison.getWhite() + " bonnes couleurs ");
					if (!Mastermind.isThereTryLeft()) {
						this.lost();
					}

				}
			}
			
			
			
		} else if (this.typePartie == 2) {

		}


	}

	public void historique() {
		int i =0;
		for (Combinaison comb : this.Mastermind.getTabTryCombinaison()) {
			for (Color c : comb.getTabCombinaison()) {
				System.out.print(c.getColor());
			}
		}
	}
	
	public void win() {
		this.MastermindState = GameState.win;
		System.out.println("Le joueur qui devine a gagné ! ");
	}

	public void lost() {
		this.MastermindState = GameState.lost;
		System.out.println("Le joueur qui devine a perdu ! ");
	}

}
