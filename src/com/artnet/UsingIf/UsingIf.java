package com.artnet.UsingIf;

import javax.swing.*;

public class UsingIf {
    public static void main(String[] args) {
        double x, y;
        String title = "Деление чисел";
        String text = "Result of operation: ";
        int type;

        x = Double.parseDouble(JOptionPane.showInputDialog("Числитель [x] = "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Знаменатель [y] = "));

        if (y != 0) {
            type = JOptionPane.PLAIN_MESSAGE;
            text += x + "/" + y + " = " + x / y;
        } else {
            type = JOptionPane.ERROR_MESSAGE;
            text += "divide by zero!";
        }

        JOptionPane.showMessageDialog(null, text, title, type);
    }
}
