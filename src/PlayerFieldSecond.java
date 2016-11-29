import javax.swing.*;
import java.awt.*;

/**
 * Created by sivenkovdn on 28.11.2016.
 */
public class PlayerFieldSecond extends JPanel {

    public PlayerFieldSecond () {
        this.setBounds(100, 31, 51, 51);
        setBackground(Color.BLUE);

        setVisible(true);

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // рисуем решётку
        for (int i = 0; i < 11; i++) {
            g.drawLine(i * 15, 0, i * 15, 150);
            g.drawLine(0, i * 15, 150, i * 15);
        }
    }
}
