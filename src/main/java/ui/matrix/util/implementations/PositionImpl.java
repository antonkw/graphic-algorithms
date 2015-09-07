package ui.matrix.util.implementations;

import ui.matrix.util.Position;

/**
 * Created by antonkw on 06.09.2015.
 */
public class PositionImpl implements Position {
    private Integer rowIndex;
    private Integer columnIndex;

    private PositionImpl() {};

    public PositionImpl(Integer rowIndex, Integer columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    @Override
    public Integer getRowIndex() {
        return rowIndex;
    }

    @Override
    public Integer getColumnIndex() {
        return columnIndex;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        Position position = (PositionImpl) obj;
        return this.rowIndex.equals(position.getRowIndex()) && this.columnIndex.equals(position.getColumnIndex());
    }
}
