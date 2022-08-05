import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        // Create JFrame
        JFrame myWindow = new JFrame();
        myWindow.setTitle("02");
        myWindow.setSize(512, 256);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create JPanel to apply color
        JPanel myPanel = new JPanel();
        myPanel.setBounds(0, 0, 512, 256);
        myPanel.setBackground(Color.yellow);

        // Create JLabel
        JLabel myLabel = new JLabel();
        myLabel.setText("The quality of this library is even worse than that of this damn language");
        myLabel.setBounds(0, 0, 512, 256);

        // Add everything to the window
        myPanel.add(myLabel);
        myWindow.add(myPanel);
    }
}
