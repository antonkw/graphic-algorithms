package ui.matrix.util;

/**
 * Created by antonkw on 06.09.2015.
 */
public interface PositionedCell extends Cell {
    public Position getPosition();

    public void setPosition(Position position);
}
