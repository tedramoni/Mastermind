package controller;
import java.util.ArrayList;
import java.util.List;

import util.CombinaisonComparaison;
import model.Combinaison;
import model.EnumGameState;
import model.Game;

/**
 * Définit les principales méthodes du Mastermind
 * 
 * @author Alexis Colonna
 *
 */
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
	
	/**
	 * Setter de TabTryCombinaison
	 * @return La liste des combinaison tentée par le joueur
	 */
	public List<Combinaison> getTabTryCombinaison() {
		return TabTryCombinaison;
	}

	/**
	 * Setter de la combinaison secrete
	 * @param newCombinaison Une combinaison
	 */
	public void setCombinaison(Combinaison newCombinaison){
		this.secretCombinaison = newCombinaison;
	}
	
	/**
	 * Méthode correspondant à un tour de Mastermind
	 * @param tryedCombinaison La combinaison à essayer
	 * @return Une classe de comparaison donnant le nombre de jetons blanc et de jetons noirs
	 */
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
	
	/**
	 * 
	 * @return Le numéro du coup et la combinaison entrée par l'utilisateur sous forme de String
	 */
	public String toString(){
		String s ="";
		
		for(int i = 0; i < this.TabTryCombinaison.size();i++){
			s = s + "["+i+"] " + this.TabTryCombinaison.get(i).toString() + this.TabResultTry.get(i).toString() + "\n";
		}
		
		return s;
	}
	/**
	 * Méthode permettant de savoir s'il reste encore des tours aux joueurs 
	 * @return un boolean qui est à true s'il reste des tours aux joueurs et à false s'il ne peut plus jouer
	 */
	public boolean isThereTryLeft(){
		return (TabTryCombinaison.size() < this.TryMax);
	}
}
