package ui;


import javax.swing.*;
import java.awt.*;

/**
 * Created by antonkw on 05.09.2015.
 */
public class MainWindow extends JFrame {
    private int WIDTH = 1200;
    private int HEIGHT = 900;

    private JPanel mainPanel;
    private JTabbedPane menuTabbed;
    private JScrollPane scrollPane;
    private JPanel drawArea;
    private JPanel Line;

    public MainWindow() {
        super("Graphic Editor");
        setContentPane(mainPanel);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(WIDTH, HEIGHT));
        MyPanel myPanel = new MyPanel();
        setDrawArea(myPanel);
        drawArea.repaint();
    }

    public void setDrawArea(JPanel jPanel) {
        this.drawArea = jPanel;

        repaint();

    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        menuTabbed = new JTabbedPane();
        mainPanel.add(menuTabbed, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        Line = new JPanel();
        Line.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        menuTabbed.addTab("Line", Line);
        scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        drawArea = new JPanel();
        drawArea.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        scrollPane.setViewportView(drawArea);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}

class MyPanel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(25, 35, 250, 400);
        setBackground(Color.GREEN);

    }
}

