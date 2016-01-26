package controller;
import java.io.IOException;

import model.Combinaison;
import model.EnumEvent;
import model.EnumMastermindType;
import model.HumanMastermind;
import model.IaMastermind;
import model.PlayerMastermind;
import util.CombinaisonComparaison;
import view.UiMastermind;

/**
 * 
 * Classe qui permet de gérer le déroulement de la partie
 *
 */
public class MastermindManager extends GameManager {

	private PlayerMastermind player1;
	private PlayerMastermind player2;
	protected UiMastermind ui;
	protected Mastermind game;



	
	/**
	 * Constructeur avec paramètre
	 * @param type type de partie (joueur humain contre joueur humain ou joueur humain contre IA)
	 */

	public MastermindManager(EnumMastermindType type){

		this.game = new Mastermind();
		this.ui = new UiMastermind();

		if(type == EnumMastermindType.HvsH){
			this.player1 = new HumanMastermind("Jean");
			this.player2 = new HumanMastermind("Michel");
		}else if(type == EnumMastermindType.HvsIA){
			this.player1 = new IaMastermind();
			this.player2 = new HumanMastermind("MichMich");
		}
	}

	/**
	 * Classe pour gérer le déroulement de la partie
	 */
	@Override
	public void play() throws IOException {


		this.ui.display(EnumEvent.Welcome);

		Combinaison secretComb = this.player1.getCombinaison();
		while(secretComb == null){
			this.ui.display(EnumEvent.InputError);
			secretComb = this.player1.getCombinaison();
		}
		
		Combinaison guessComb;

		this.game.setCombinaison(secretComb);
		while(!this.game.isLoose() && !this.game.isWin()){

			this.ui.display(EnumEvent.AskCombinaison);

			guessComb = this.player2.getCombinaison();

			while(guessComb == null){
				this.ui.display(EnumEvent.InputError);
				guessComb = this.player1.getCombinaison();
			}
			
			CombinaisonComparaison result = this.game.tryCombinaison(guessComb);

			this.ui.displayHistory(this.game.toString());
			//this.ui.displayResultComparaison(result);
			if(this.game.isLoose()){
				this.ui.display(EnumEvent.Loose);
			}
			if(this.game.isWin()){
				this.ui.display(EnumEvent.Win);
			}
		}


	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}
}
