import javax.swing.*;
import java.awt.*;

/**
 * Created by sivenkovdn on 28.11.2016.
 */
public class PlayerFieldFirst extends JPanel {


    public PlayerFieldFirst () {
        setBounds(190, 31, 151, 151);
        setBackground(Color.MAGENTA);
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
