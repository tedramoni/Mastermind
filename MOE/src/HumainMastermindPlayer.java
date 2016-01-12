import java.util.Scanner;


public class HumainMastermindPlayer extends MastermindPlayer {

	@Override
	public Combinaison getCombinaison() {

		Scanner sc = new Scanner(System.in);
		System.out.println("r = Rouge / v = Vert / j = Jaune / b = Bleu : ");
		System.out.println("Saisissez une combinaison : ");
		String saisie = sc.nextLine();    
		return new StringToCombinaisonConverter(saisie).conversion();
	}

	@Override
	public Combinaison getInt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Combinaison getRawInput() {
		// TODO Auto-generated method stub
		return null;
	}

}
