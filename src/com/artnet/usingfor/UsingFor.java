package com.artnet.usingfor;

import javax.swing.*;

public class UsingFor {
    public static void main(String[] args) {
        int count, i, s = 0;

        count = Integer.parseInt(JOptionPane.showInputDialog("Get limit amount:"));
        String text = "Сумма натуральных чисел от 1 до "+count+": ";

        for (i = 1; i <= count; i++) {
            s += i;
        }

        JOptionPane.showMessageDialog(null, text + s);
    }
}
