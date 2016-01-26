import java.util.ArrayList;
import java.util.List;


public class Mastermind extends Game {
	
	private int TryMax = 10;
	private int Try = 0;
	private int SizeCombinaison = 4;
	private Combinaison secretCombinaison;
	private List<Combinaison> TabTryCombinaison = new ArrayList<Combinaison>();
	
	@Override
	public void initialisation() {
		// TODO Auto-generated method stub
		
	}
	
	public void setCombinaison(Combinaison newCombinaison){
		this.secretCombinaison = newCombinaison;
	}
	
	public CombinaisonComparaison tryCombinaison(Combinaison tryedCombinaison){
		TabTryCombinaison.add(tryedCombinaison);
		CombinaisonComparaison c = new CombinaisonComparaison(new Combinaison(secretCombinaison), tryedCombinaison);
		
		this.Try ++;
		
		if(c.getNbNoirs() == this.SizeCombinaison){
			this.setState(EnumGameState.Win);
		}
		if(!this.isThereTryLeft()){
			this.setState(EnumGameState.Lost);
		}
		
		return c;
	}
	
	public boolean isThereTryLeft(){
		return (TabTryCombinaison.size() < this.TryMax);
	}
}
