import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		afficheMenu();
		int Choix = getChoix();

		if(Choix== 1){
			System.out.println("Passez la main au cachotier");
			ControllerMastermind ControllerMastermind = new ControllerMastermind(1);
			ControllerMastermind.startMastermind();
		}else if (Choix== 2){
			System.out.println("ordi");
			ControllerMastermind ControllerMastermind = new ControllerMastermind(2);
			ControllerMastermind.startMastermind();
		}


		
	}
	public static void afficheMenu(){
		System.out.println("------------------MASTERMIND------------------");
		System.out.println("	1 : Jouer contre un autre joueur");
		System.out.println("	2 : Jouer contre l'ordinateur");
	}
	public static int getChoix(){
		int Choix = 0 ;
		while(Choix!=1 && Choix!=2){
			Scanner sc = new Scanner(System.in);
			while(!sc.hasNextInt()){
				System.out.println("Entrez un chiffre svp :");
				sc.next();
			}
			Choix = sc.nextInt();
		}
		return Choix;
	}
	public void runApplication(){

	}
	
}

