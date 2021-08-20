
    import java.awt.*;
import javax.swing.*;

    public class HelloJava1 extends JComponent {

        public static void main(String[] args) {
            Runnable r = new Runnable() {
                public void run() {
                    JFrame f = new JFrame("HelloJava1");
                    // f.setSize(300, 300);  better to pack() the frame
                    f.getContentPane().add(new HelloJava1());
                    // pack should be AFTER components are added..
                    f.pack();
                    f.setVisible(true);
                }
            };
            // Swing GUIs should be created and updated on the EDT
            SwingUtilities.invokeLater(r);
        }

        @Override  // good practice..
        public void paintComponent(java.awt.Graphics g) {
            // always call super method 1st!
            super.paintComponent(g);
            g.drawString("Hello, Java!", 125, 95);
        }

        // instead of setting the size of components, it is
        // better to override the preferred size.
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300,300);
        }
    }


