package Model;

import Model.Combinaison;
import Model.Player;

import java.util.ArrayList;

public class Ia extends Player {


	@Override
	public int getTryMax() {
		// TODO Auto-generated method stub
		return 9;
	}
	@Override
	public Combinaison getCombinaison() {

		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.randomColor());
		a.add(1, Color.randomColor());
		a.add(2, Color.randomColor());
		a.add(3, Color.randomColor());
		a.add(4, Color.randomColor());

		Combinaison secret = new Combinaison(a);
		return secret;
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
