package ui.matrix.util.implementations;

import ui.matrix.util.Cell;

/**
 * Created by antonkw on 05.09.2015.
 */
public class CellImpl implements Cell {

    protected Colour colour;

    private CellImpl() {}

    public CellImpl(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public boolean isColoured() {
        return !colour.equals(Colour.WHITE);
    }
}
