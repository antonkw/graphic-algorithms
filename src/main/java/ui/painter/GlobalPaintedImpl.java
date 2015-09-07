package ui.painter;

import ui.matrix.Matrix;
import ui.painter.util.ScaleCoefficient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by antonkw on 06.09.2015.
 */
public final class GlobalPaintedImpl implements GlobalPainter {
    private Integer scaleCoefficient;

    private JPanel drawPanel;

    private GlobalPaintedImpl() {
    }

    public GlobalPaintedImpl(JPanel jPanel) {
        scaleCoefficient = ScaleCoefficient.DEFAULT_SCALE_COEFFICIENT();
        this.drawPanel = jPanel;
    }

    @Override
    public void setScaleCoefficient(Integer scaleCoefficient) {
        this.scaleCoefficient = scaleCoefficient;
    }

    @Override
    public Integer getScaleCoefficient() {
        return scaleCoefficient;
    }

    @Override
    public void drawMatrix(Matrix matrix) {

        /*MyPanel myPanel = new MyPanel();

        drawPanel.add(myPanel);*/


    }
}



class Surface extends JPanel implements ActionListener {

    private final int DELAY = 150;
    private Timer timer;

    public Surface() {

        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public Timer getTimer() {

        return timer;
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.blue);

        int w = getWidth();
        int h = getHeight();

        Random r = new Random();

        for (int i = 0; i < 2000; i++) {

            int x = Math.abs(r.nextInt()) % w;
            int y = Math.abs(r.nextInt()) % h;
            g2d.drawLine(x, y, x, y);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }


    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        repaint();
    }
}