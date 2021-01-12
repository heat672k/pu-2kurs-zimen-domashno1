package Game;

import figures.Guard;
import figures.Lider;

import java.awt.*;

public class GameTile extends GameBoard {
    public GameTile () {
        Guard guard = new Guard();

        Lider lider = new Lider();

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.setColor(Color.RED);
        g.fillRect(0,30,100,100);
        g.fillRect(400,30,100,100);
        g.fillRect(100,430,100,100);
        g.fillRect(300,430,100,100);

        g.setColor(Color.BLACK);
        g.fillRect(0,430,100,100);
        g.fillRect(400,430,100,100);
        g.fillRect(100,30,100,100);
        g.fillRect(300,30,100,100);

        g.setColor(Color.GRAY);
        g.fillRect(0,130,100,100);
        g.fillRect(100,130,100,100);
        g.fillRect(300,130,100,100);
        g.fillRect(400,130,100,100);
        g.fillRect(0,330,100,100);
        g.fillRect(100,330,100,100);
        g.fillRect(300,330,100,100);
        g.fillRect(400,330,100,100);

        g.fillOval(220,250,60,60);

        Guard guard = new Guard();
        guard.render(g);
        Lider lider = new Lider();
        lider.render(g);

    }

}
