package controller;
import java.util.ArrayList;
import java.util.List;

import util.CombinaisonComparaison;
import model.Combinaison;
import model.EnumGameState;
import model.Game;


public class Mastermind extends Game {
	
	private int TryMax = 10;
	private int Try = 0;
	private int SizeCombinaison = 4;
	private Combinaison secretCombinaison;
	private List<Combinaison> TabTryCombinaison = new ArrayList<Combinaison>();
	private List<CombinaisonComparaison> TabResultTry = new ArrayList<CombinaisonComparaison>();

	
	@Override
	public void initialisation() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Combinaison> getTabTryCombinaison() {
		return TabTryCombinaison;
	}


	public void setCombinaison(Combinaison newCombinaison){
		this.secretCombinaison = newCombinaison;
	}
	
	public CombinaisonComparaison tryCombinaison(Combinaison tryedCombinaison){
		CombinaisonComparaison c = new CombinaisonComparaison(new Combinaison(secretCombinaison), new Combinaison(tryedCombinaison));
		
		TabTryCombinaison.add(tryedCombinaison);
		TabResultTry.add(c);
		
		this.Try ++;
		
		if(c.getNbNoirs() == this.SizeCombinaison){
			this.setState(EnumGameState.Win);
		}
		if(!this.isThereTryLeft()){
			this.setState(EnumGameState.Lost);
		}
		
		return c;
	}
	
	public String toString(){
		String s ="";
		
		for(int i = 0; i < this.TabTryCombinaison.size();i++){
			s = s + "["+i+"] " + this.TabTryCombinaison.get(i).toString() + this.TabResultTry.get(i).toString() + "\n";
		}
		
		return s;
	}
	
	public boolean isThereTryLeft(){
		return (TabTryCombinaison.size() < this.TryMax);
	}
}
