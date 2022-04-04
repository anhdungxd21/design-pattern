package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserveExample s = new SwingObserveExample();
        s.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("Don't do it, you might regret!"));
        button.addActionListener(event -> System.out.println("Come on, do it!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(400,800);
        frame.setVisible(true);
    }
}
