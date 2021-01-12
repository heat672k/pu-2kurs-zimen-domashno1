package figures;

import java.awt.*;

public class Guard {
    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(25,55,40,40);
        g.fillOval(125,55,40,40);
        g.fillOval(225,55,40,40);
        g.fillOval(325,55,40,40);

        g.setColor(Color.yellow);
        g.fillOval(28,58,35,35);
        g.fillOval(128,58,35,35);
        g.fillOval(228,58,35,35);
        g.fillOval(328,58,35,35);

        g.setColor(Color.yellow);
        g.fillOval(125,455,40,40);
        g.fillOval(225,455,40,40);
        g.fillOval(325,455,40,40);
        g.fillOval(425,455,40,40);

        g.setColor(Color.green);
        g.fillOval(128,458,35,35);
        g.fillOval(228,458,35,35);
        g.fillOval(328,458,35,35);
        g.fillOval(428,458,35,35);

    }
}
