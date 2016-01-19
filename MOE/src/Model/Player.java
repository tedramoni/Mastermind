package Model;

import Converter.StringToCombinaison;
import Model.Combinaison;

public abstract class Player {


    // Input flux  /  String pour console et pour interface graphique. Toujours string, donc besoin converter String --> Model.Combinaison
    private StringToCombinaison Converter;

    public abstract int getTryMax();

    public abstract Combinaison getCombinaison();

    public abstract Combinaison getInt();

    public abstract Combinaison getRawInput();
}
