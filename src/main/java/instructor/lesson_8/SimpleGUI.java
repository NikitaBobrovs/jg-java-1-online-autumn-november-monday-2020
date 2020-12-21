package instructor.lesson_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JavaGuru Rocks");
        JPanel panel = new JPanel();

        final JLabel label = new JLabel("");
        JButton helloButton = new JButton("OK");

        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              label.setText("Hello!");
            }
        });

        panel.add(label);
        panel.add(helloButton);

        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
