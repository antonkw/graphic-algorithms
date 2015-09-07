package ui.matrix;

import ui.matrix.util.Cell;
import ui.matrix.util.Position;
import ui.matrix.util.PositionedCell;
import ui.matrix.util.implementations.Colour;
import ui.matrix.util.implementations.PositionedCellImpl;
import ui.matrix.util.implementations.Size;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antonkw on 06.09.2015.
 */
public final class MatrixImpl implements Matrix {
    private Cell[][] matrix;

    private List<Position> colouredCellsPositions;

    private MatrixImpl() {
    }

    public MatrixImpl(Size size) {
        if (size.getHeight() * size.getWidth() > Integer.MAX_VALUE)
            throw new IndexOutOfBoundsException("too large matrix!");
        matrix = new Cell[size.getHeight()][size.getWidth()];
        colouredCellsPositions = new ArrayList<Position>(size.getHeight() * size.getWidth());
    }

    @Override
    public boolean isCellColoured(Position cellPosition) {
        return matrix[cellPosition.getRowIndex()][cellPosition.getColumnIndex()].isColoured();
    }

    @Override
    public Colour getCellColour(Position cellPosition) {
        return matrix[cellPosition.getRowIndex()][cellPosition.getColumnIndex()].getColour();
    }

    @Override
    public void setCellColour(Colour colour, Position cellPosition) {
        matrix[cellPosition.getRowIndex()][cellPosition.getColumnIndex()].setColour(colour);
        if (!colouredCellsPositions.contains(cellPosition)) {
            colouredCellsPositions.add(cellPosition);
        }
    }

    @Override
    public Iterable<PositionedCell> getColouredCells() {
        List<PositionedCell> colouredCells = new ArrayList<>();
        for (Position colouredCellsPosition : colouredCellsPositions) {
            colouredCells.add(new PositionedCellImpl
                    (matrix[colouredCellsPosition.getRowIndex()][colouredCellsPosition.getColumnIndex()],
                            colouredCellsPosition));
        }
        return colouredCells;
    }

    @Override
    public void reset() {
        for (Position colouredCellsPosition : colouredCellsPositions) {
            matrix[colouredCellsPosition.getRowIndex()][colouredCellsPosition.getColumnIndex()].
                    setColour(Colour.DEFAULT_BACKGROUND_COLOUR());
        }
        colouredCellsPositions.clear();
    }
}
