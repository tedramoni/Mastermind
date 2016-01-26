package Model;

import Model.Combinaison;
import Model.Player;
import Converter.StringToCombinaison;

import java.util.Scanner;


public class Humain extends Player {


	@Override
	public Combinaison getCombinaison() {

		Scanner sc = new Scanner(System.in);
		System.out.println("r = Rouge / v = Vert / j = Jaune / b = Bleu : ");
		System.out.println("Saisissez une combinaison : ");
		String saisie = sc.nextLine();    
		return new StringToCombinaison(saisie).conversion();
	}

	public int getTryMax(){
		int nb = 0 ;
		while(nb==0){
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le nombre d'essais maximum");
			while(!sc.hasNextInt()){
				System.out.println("Entrez un chiffre svp :");
				sc.next();
			}
			nb = sc.nextInt();
		}
		return nb;
	}
	@Override
	public Combinaison getInt() {
		// TODO Auto-generated method stub //VBO cette méthode sert-elle ?
		return null;
	}

	@Override
	public Combinaison getRawInput() {
		// TODO Auto-generated method stub
		return null;
	}

}
