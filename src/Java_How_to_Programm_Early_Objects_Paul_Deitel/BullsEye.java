package Java_How_to_Programm_Early_Objects_Paul_Deitel;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class BullsEye extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the face
        int a =1;
        for (int i = 10; i > 0; i--) {



            int color = i % 2;
            switch (color) {
                case 0:
                    g.setColor(Color.RED);
                    g.fillOval(100+(-10 * i / 2), 100+(-10 * i / 2), 10 * i, 10 * i);
                   /* g.setColor(Color.WHITE);
                    g.fillOval(10 * i , 10 * i , 20 * i-30, 20 * i-30);*/
                    break;
                case 1:

                    g.setColor(Color.BLACK);
                    g.fillOval(100+(-10 * i / 2), 100+(-10 * i / 2), 10 * i, 10 * i);
                    a++;
            } // end class DrawSmiley
        }
    }
}

 class DrawSmileyTest
{
    public static void main(String[] args)
    {
        BullsEye panel = new BullsEye();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
} // end class DrawSmileyTest