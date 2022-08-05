import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        // Create JFrame
        JFrame myFrame = new JFrame();
        myFrame.setSize(512, 256);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(null);

        // Create JTextField
        JTextField myTextField = new JTextField();
        myTextField.setBounds(0, 0, 512, 64);

        // Create JButton
        JButton myButton = new JButton();
        myButton.setBounds(0, 64, 256, 64);
        myButton.setText("Click me!");

        // Create JTextField
        JTextField mySecondTextField = new JTextField();
        mySecondTextField.setBounds(0, 128, 512, 64);
        mySecondTextField.setEditable(false);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mySecondTextField.setText(myTextField.getText());
            }
        });

        // Add everything to the window
        myFrame.add(myTextField);
        myFrame.add(mySecondTextField);
        myFrame.add(myButton);

        // Make the window visible
        myFrame.setVisible(true);
    }
}
