package ui.matrix.util.implementations;

import ui.matrix.util.Cell;
import ui.matrix.util.Position;
import ui.matrix.util.PositionedCell;

/**
 * Created by antonkw on 06.09.2015.
 */
public final class PositionedCellImpl extends CellImpl implements PositionedCell {
    private Position position;

    public PositionedCellImpl(Colour colour, Position position) {
        super(colour);
        this.position = position;
    }

    public PositionedCellImpl(Cell cell, Position position) {
        super(cell.getColour());
        this.position = position;
    }


    @Override
    public final Position getPosition() {
        return position;
    }

    @Override
    public final void setPosition(Position position) {
        this.position = position;
    }
}
