package model;


public abstract class Game {

	protected EnumGameState state;
	
	public Game(){
		setState(EnumGameState.Created);
	}
	
	public abstract void initialisation();

	public EnumGameState getState() {
		return state;
	}

	public void setState(EnumGameState state) {
		this.state = state;
	}
	
	public boolean isWin(){
		return(state == EnumGameState.Win);
	}
	public boolean isLoose(){
		return(state == EnumGameState.Lost);
	}
}
