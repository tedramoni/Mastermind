package controller;
import java.util.ArrayList;
import java.util.List;

import util.CombinaisonComparaison;
import model.Combinaison;
import model.EnumGameState;
import model.Game;

/**
 * D�finit les principales m�thodes du Mastermind
 * 
 * @author Alexis Colonna
 *
 */
public class Mastermind extends Game {

	private int TryMax = 10;
	private int Try = 0;
	private int SizeCombinaison = 5;
	private Combinaison secretCombinaison;
	private List<Combinaison> TabTryCombinaison = new ArrayList<Combinaison>();
	private List<CombinaisonComparaison> TabResultTry = new ArrayList<CombinaisonComparaison>();


	@Override
	public void initialisation() {
		// TODO Auto-generated method stub

	}

	/**
	 * Setter de TabTryCombinaison
	 * @return La liste des combinaison tent�e par le joueur
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
	 * M�thode correspondant � un tour de Mastermind
	 * @param tryedCombinaison La combinaison � essayer
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
			s = s + "["+i+"] " + this.TabTryCombinaison.get(i).toString() + this.TabResultTry.get(i).toString() ;
		}

		return s;
	}
	/**
	 * M�thode permettant de savoir s'il reste encore des tours aux joueurs 
	 * @return un boolean qui est � true s'il reste des tours aux joueurs et � false s'il ne peut plus jouer
	 */
	public boolean isThereTryLeft(){
		return (TabTryCombinaison.size() < this.TryMax);
	}

	/**
	 * Getter du nombre d'essai du joueur
	 * @return un int 
	 */
	public int getTry(){
		return this.Try;
	}

	/**
	 * Setter du nombre d'essai du joueur
	 * @param un int 
	 */
	public void setTry(int t){
		this.Try = t;
	}
}
