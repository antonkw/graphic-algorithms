package ui.painter;

import ui.matrix.Matrix;

/**
 * Created by antonkw on 06.09.2015.
 */
public interface GlobalPainter {
    public void setScaleCoefficient(Integer scaleCoefficient);

    public Integer getScaleCoefficient();

    public void drawMatrix(Matrix matrix);
}
