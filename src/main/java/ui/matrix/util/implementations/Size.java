package ui.matrix.util.implementations;

/**
 * Created by antonkw on 06.09.2015.
 */
public class Size {
    private Integer width;

    private Integer height;

    private Size() {}

    public Size(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }
}
