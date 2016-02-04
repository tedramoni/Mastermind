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
	private boolean elephantMode = false;
	private EnumMastermindType type;



	/**
	 * Constructeur sans paramètres
	 */

	public MastermindManager() throws IOException{
		this.init();
	}

	/**
	 * Classe pour gérer le déroulement de la partie
	 */
	@Override
	public void play() throws IOException {
		if(this.type == EnumMastermindType.HvsH || this.type == EnumMastermindType.HvsHE )
			this.ui.display(EnumEvent.AskCachotier);

		Combinaison secretComb = this.player1.getCombinaison();
		while(secretComb == null || secretComb.getNbColor()<5 || secretComb.getNbColor()>5 ){
			this.ui.display(EnumEvent.InputError);
			secretComb = this.player1.getCombinaison();
		}

		Combinaison guessComb;

		this.game.setCombinaison(secretComb);
		while(!this.game.isLoose() && !this.game.isWin()){

			this.ui.display(EnumEvent.AskCombinaison);

			guessComb = this.player2.getCombinaison();

			while(guessComb == null || guessComb.getNbColor()<5 || guessComb.getNbColor()>5){
				this.ui.display(EnumEvent.InputError);
				guessComb = this.player1.getCombinaison();
			}

			CombinaisonComparaison result = this.game.tryCombinaison(guessComb);



			if(this.elephantMode == false)
				this.ui.displayHistory(this.game.toString());
			else this.ui.displayResultComparaison(result);


			if(this.game.isLoose()){
				this.ui.display(EnumEvent.Loose);
				init();
			}
			if(this.game.isWin()){
				this.ui.display(EnumEvent.Win);
				init();


			}
		}


	}

	@Override
	public void init() throws IOException {
		this.game = new Mastermind();
		this.ui = new UiMastermind();		
		this.ui.display(EnumEvent.Welcome);
		this.ui.display(EnumEvent.ChoicePartie);	
		this.player1 = null;
		this.player2 = null;
		this.elephantMode=false;
		this.type=null;
		this.player2 = new HumanMastermind("Michel");
		this.type = this.player2.choicePartie();

		while(type == null || type == EnumMastermindType.Quit || type == EnumMastermindType.Rules){

			if(this.type == null)
				this.ui.display(EnumEvent.InputError);			
			else if(this.type == EnumMastermindType.Rules){
				this.ui.display(EnumEvent.Rules);
				this.ui.display(EnumEvent.ChoicePartie);
			}
			else if(this.type == EnumMastermindType.Quit)
				this.quit();

			type = this.player2.choicePartie();
		}

		if(type == EnumMastermindType.HvsH)
			this.player1 = new HumanMastermind("Jean");

		else if(type == EnumMastermindType.HvsIA){
			this.player1 = new IaMastermind();

		}else if(type == EnumMastermindType.HvsIAE){
			this.player1 = new IaMastermind();
			this.elephantMode = true;

		}else if(type == EnumMastermindType.HvsHE){
			this.player1 = new HumanMastermind("Jean");
			this.elephantMode = true;
		}
		this.play();

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}
}
