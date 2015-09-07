package ui.matrix.util;

import ui.matrix.util.implementations.Colour;

/**
 * Created by antonkw on 05.09.2015.
 */
public interface Cell {
    public void setColour(Colour colour);

    public Colour getColour();

    public boolean isColoured();
}
