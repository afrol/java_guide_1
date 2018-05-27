package com.artnet.UsingWhile;

import javax.swing.*;

public class UsingWhile {
    public static void main(String[] args) {
        int count, i = 1, j = 1, s1 = 0, s2 = 0;

        count = Integer.parseInt(JOptionPane.showInputDialog("Write border"));

        String text = "Sum of range from 1 till " + count + "\n";
        String str1 = "Operator while:";
        String str2 = "Operator do while:";

        while (i <= count) {
            s1 += i++;
        }

        do {
            s2 += j++;
        } while (j <= count);

        str1 += s1;
        str2 += s2;

        JOptionPane.showMessageDialog(null, text + str1 + "\n" + str2);
    }
}
