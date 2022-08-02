import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        // Create and initialize new frame
        JFrame myFrame = new JFrame();                                      // Create JFrame instance
        myFrame.setSize(500, 400);                                          // Set width and height
        myFrame.setLayout(null);                                            // Use no layout manager
        myFrame.setVisible(true);                                           // Make the frame visible
        myFrame.setTitle("Exercise 01");                                    // Set the frame's title
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    // Make it so that the program ends when the Window is closed

        // Create and initialize a button
        JButton myButton = new JButton("Hello, world!");                    // Create JButton instance
        myButton.setBounds(                                                 // Set position and size of the enew button
                100, 100,
                256, 32
        );

        // Add items to the frame to make them visible
        myFrame.add(myButton);
    }
}
