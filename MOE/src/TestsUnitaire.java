import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class TestsUnitaire {

	@Test
	public void TestStringToCombinaison() {
		String s = "rvvb";
		StringToCombinaisonConverter converteur = new StringToCombinaisonConverter(s);
		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);

		Combinaison get = converteur.conversion();
		ArrayList<Color> b = get.getTabCombinaison();
		
		Assert.assertEquals(a,b);

		
	}

}
