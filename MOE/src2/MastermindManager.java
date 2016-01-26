import java.io.IOException;


public class MastermindManager extends GameManager {

	private PlayerMastermind player1;
	private PlayerMastermind player2;
	protected UiMastermind ui;
	protected Mastermind game;
	
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

	@Override
	public void play() throws IOException {

		
		this.ui.display(EnumEvent.Welcome);
		
		Combinaison secretComb = this.player1.getCombinaison();
		Combinaison guessComb;
		
		this.game.setCombinaison(secretComb);
		
		while(!this.game.isLoose() && !this.game.isWin()){
			
			guessComb = this.player2.getCombinaison();
			this.game.tryCombinaison(guessComb);
			
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
