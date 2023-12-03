import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotatingLine extends JPanel implements ActionListener {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int LINE_LENGTH = 200;
    private static final int ROTATION_SPEED = 5;

    private double angle = 0;
    private Color lineColor;

    public RotatingLine() {
        Timer timer = new Timer(16, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        int x1 = centerX;
        int y1 = centerY;
        int x2 = centerX + (int) (LINE_LENGTH * Math.cos(Math.toRadians(angle)));
        int y2 = centerY + (int) (LINE_LENGTH * Math.sin(Math.toRadians(angle)));

        g.setColor(lineColor);
        g.drawLine(x1, y1, x2, y2);
    }

    public void actionPerformed(ActionEvent e) {
        // Обновляем угол поворота
        angle += ROTATION_SPEED;
        if (angle >= 360) {
            angle = 0;
        }

        // Изменяем цвет прямой в зависимости от угла поворота
        int red = (int) (angle / 360.0 * 255);
        int blue = (int) ((360 - angle) / 360.0 * 255);
        lineColor = new Color(red, 0, blue);

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        RotatingLine rotatingLine = new RotatingLine();
        frame.add(rotatingLine);

        frame.setVisible(true);
    }
}

//LAB-4 VAR-4

//        JFrame fr = new JFrame("Вращение отвратительно огромной цветной линии");
//        fr.setPreferredSize(new Dimension(800, 800));
//        final JPanel pan = new JPanel();
//        fr.add(pan);
//        fr.setVisible(true);
//        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        fr.pack();
//
//        final float[] ti = {0f};
//        Timer tm = new Timer(500, new ActionListener() {
//            int i = 0;
//
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                Graphics2D gr = (Graphics2D) pan.getRootPane().getGraphics();
//                pan.update(gr);
//                GeneralPath path = new GeneralPath();
//                ti[0] += 0.2f;
//                gr.setColor(new Color((int) (sin(ti[0]*3)*100+100), (int) (cos(ti[0]*13)*100+100), (int) (sin(ti[0]*7)*100+100)));
//                path.moveTo(400,400);
//                path.lineTo(sin(ti[0])*399+400,cos(ti[0])*399+400);
//
//                gr.draw(path);
//            }
//        });
//        tm.start();