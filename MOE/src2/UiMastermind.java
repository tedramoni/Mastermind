import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


public class UiMastermind extends Ui{
	
	protected OutputStream out;
	
	public UiMastermind(){
		this.out = System.out;
	}
	
	@Override
	public void display(EnumEvent event) throws IOException {

		switch (event) {
		case Welcome:
			System.out.println("Welcome");
			this.out.write(("--- WELCOME ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Quit:
			this.out.write(("--- QUIT ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Loose:
			this.out.write(("--- LOOSE ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Win:
			this.out.write(("--- WIN ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Rules:
			this.out.write(("--- RULES ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		default:
			break;
			
		}
	}
	
	

}
