
public class ControllerMastermind {

	private GameState MastermindState = GameState.stopped;
	private GameMastermind Mastermind;
	private MastermindPlayer Seer;
	private MastermindPlayer Player2;

	public void startMastermind(){

		this.MastermindState = GameState.started;
		this.Mastermind = new GameMastermind();
		Combinaison rightCombinaison;
		Combinaison tryedCombinaison;
		//Boolean isRightCombinaison;
		Comparaison comparaison;

		rightCombinaison = Player2.getCombinaison();
		//isRightCombinaison = false;

		while(this.MastermindState != GameState.win && this.MastermindState != GameState.lost){

			tryedCombinaison = Seer.getCombinaison();
			comparaison = Mastermind.tryCombinaison(tryedCombinaison);
			// afficher la comparaison
			if(comparaison.getBlack() == comparaison.getSize()){
				this.win();
			}
			else{
				System.out.println("Vous avez " + comparaison.getBlack() + " pions bien plac�s et "+ comparaison.getWhite() + " bonnes couleurs ");
				if(!Mastermind.isThereTryLeft()){
					this.lost();
				}
				
			}
		}
	}

	public void win(){
		this.MastermindState = GameState.win;
		System.out.println("Le joueur qui devine a gagn� ! ");
	}

	public void lost(){
		this.MastermindState = GameState.lost;
		System.out.println("Le joueur qui devine a perdu ! ");
	}

}
