package Model;

import Model.*;

import java.util.ArrayList;


public class Game {

	private int NbTryMax = 10;
	private Combinaison secretCombinaison;
	private ArrayList<Combinaison> TabTryCombinaison = new ArrayList<Combinaison>();
	
	
	public void setCombinaison(Combinaison newCombinaison)
	{
		this.secretCombinaison = newCombinaison;
	}
	
	public Comparaison tryCombinaison(Combinaison tryedCombinaison){
		TabTryCombinaison.add(tryedCombinaison);
		return new Comparaison(secretCombinaison, tryedCombinaison);
	}

	public int getNbTryMax() {
		return NbTryMax;
	}

	public void setNbTryMax(int nbTryMax) {
		assert(nbTryMax>1); // !!!!!!!!!!!!!!!!!!!!! //VBO Oui !!!!!
		this.NbTryMax = nbTryMax;
	}
	
	public ArrayList<Combinaison> getTabTryCombinaison() {
		return TabTryCombinaison;
	}

	public boolean isThereTryLeft(){
		return (TabTryCombinaison.size() < this.NbTryMax);
	}
	
}
