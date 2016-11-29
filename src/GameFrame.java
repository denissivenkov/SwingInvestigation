import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sivenkovdn on 28.11.2016.
 */
public class GameFrame extends JFrame {

    public static void main (String [] args) {

        new GameFrame();
    }

    public GameFrame() {
        super();
        setTitle("SeaBattle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);
        setLocationRelativeTo(null);
        addComponents(getContentPane());
        pack();
        setVisible(true);

    }

    private void addComponents (Container contantPane) {
        contantPane.setLayout(null);
        contantPane.add(new TopMenuBar());
        contantPane.add(new PlayerFieldFirst());
        contantPane.add(new PlayerFieldSecond());

    }
}
