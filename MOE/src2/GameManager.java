import java.io.IOException;


public abstract class GameManager {
	/*protected Ui ui;
	protected Game game;*/
	
	public abstract void play() throws IOException;
	public abstract void init() throws IOException;
	public abstract void quit() throws IOException;
}
