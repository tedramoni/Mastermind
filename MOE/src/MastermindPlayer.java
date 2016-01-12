
public abstract class MastermindPlayer {
	
	// Input flux  /  String pour console et pour interface graphique. Toujours string, donc besoin converter String --> Combinaison
	private StringToCombinaisonConverter Converter;
	public abstract Combinaison getCombinaison();
	public abstract Combinaison getInt();
	public abstract Combinaison getRawInput();
}
