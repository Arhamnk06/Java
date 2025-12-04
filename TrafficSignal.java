import java.awt.*;
import javax.swing.*;

public class TrafficSignal extends JPanel {

    public TrafficSignal() {
        setPreferredSize(new Dimension(200, 300));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the traffic light box
        int boxX = 70;
        int boxY = 50;
        int boxWidth = 60;
        int boxHeight = 180;

        g.setColor(Color.DARK_GRAY);
        g.fillRect(boxX, boxY, boxWidth, boxHeight);

        // Red light
        g.setColor(Color.RED);
        g.fillOval(boxX + 10, boxY + 10, 40, 40);

        // Yellow light
        g.setColor(Color.YELLOW);
        g.fillOval(boxX + 10, boxY + 70, 40, 40);

        // Green light
        g.setColor(Color.GREEN);
        g.fillOval(boxX + 10, boxY + 130, 40, 40);
        g.setColor(Color.BLACK);
    g.drawLine(boxX, boxY +boxHeight/2, boxX + boxWidth,boxY+boxHeight/2 );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Signal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TrafficSignal());
        frame.pack();
        frame.setVisible(true);
    }
}