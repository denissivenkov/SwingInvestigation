import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sivenkovdn on 28.11.2016.
 */
public class TopMenuBar extends JMenuBar {
    private JMenuBar topMenuBar;
    private JMenu game;
    private JMenu help;
    private JMenuItem newGame;
    private JMenuItem exit;
    private JMenuItem rules;
    private JMenuItem author;

    public TopMenuBar () {
        super();
        game = new JMenu("Game");
        help = new JMenu("Help");

        this.add(game);
        this.add(help);

        newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Start of new game
                game.setPopupMenuVisible(false);
            }
        });


        exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //exit from app.
                game.setPopupMenuVisible(false);
            }
        });

            rules = new JMenuItem("Rules");
        rules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Link to Rules
                help.setPopupMenuVisible(false);
            }
        });

        author = new JMenuItem("Author");
        author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //information about author
                help.setPopupMenuVisible(false);
            }
        });


        game.add(newGame);
        game.add(exit);
        help.add(rules);
        help.add(author);

        setPref();
        this.setBounds(0, 0, 800, 21);


    }

    private void setPref () {
        newGame.setBorderPainted(false);
        newGame.setFocusPainted(false);
        newGame.setContentAreaFilled(false);


        exit.setBorderPainted(false);
        exit.setFocusPainted(false);
        exit.setContentAreaFilled(false);

        rules.setBorderPainted(false);
        rules.setFocusPainted(false);
        rules.setContentAreaFilled(false);

        author.setBorderPainted(false);
        author.setFocusPainted(false);
        author.setContentAreaFilled(false);

    }





}
