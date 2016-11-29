import javax.swing.*;
import java.awt.*;

/**
 * Created by sivenkovdn on 28.11.2016.
 */
public class PanelField extends JPanel {
    public PanelField () {
        setLayout(new FlowLayout());
        this.add(new PlayerFieldFirst());

        setVisible(true);
    }
}
