package ui.matrix;

import ui.matrix.util.Position;
import ui.matrix.util.PositionedCell;
import ui.matrix.util.implementations.Colour;

/**
 * Created by antonkw on 05.09.2015.
 */
public interface Matrix {
    public boolean isCellColoured(Position cellPosition);

    public Colour getCellColour(Position cellPosition);

    public void setCellColour(Colour colour, Position cellPosition);

    public Iterable<PositionedCell> getColouredCells();

    public void reset();
}
