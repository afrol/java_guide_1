package com.artnet.makechoice;

import javax.swing.*;

public class MakeChoice {
    public static void main(String[] args) {
        double number = Integer.parseInt(JOptionPane.showInputDialog("Input int: "));
        String text = number % 2 == 0 ? "Even" : "Odd";
        JOptionPane.showMessageDialog(
                null,
                "Yuo chosen: " + text, "Yolo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
