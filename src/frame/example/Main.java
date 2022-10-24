package frame.example;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //MyFrame myFrame = new MyFrame(); //creates an instance of frame

        // JLabel = a GUI display area for a string of text, an image, or both. Label is a component for a frame

        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.red,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of ImageIcon
        label.setForeground(new Color(0xF3532F)); //set font color of text
        label.setFont(new Font("Times New Roman", Font.BOLD, 30)); //set font of text
        label.setIconTextGap(10); //set gap of text to image
        label.setBackground(Color.blue); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.LEFT); //set horizontal position of icon+text within label
        label.setBounds(700, 300, 350, 350); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("JFrame title goes here");
        frame.setIconImage(image.getImage());
        frame.setLayout(null); //set the label in the defined bounds;otherwise, set it on the entire frame
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // Adding a comment
    }
}
