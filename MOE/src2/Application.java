import java.io.IOException;
import java.util.List;

import controller.MastermindManager;
import model.EnumMastermindType;


public class Application {
	
	public static void main(String[] args) throws IOException{
		System.out.println("------------------APPLICATION------------------");
		MastermindManager manager = new MastermindManager(EnumMastermindType.HvsH);
		manager.play();
		
	}
	
}
