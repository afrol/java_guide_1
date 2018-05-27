package com.artnet.CharArraySorting;

import javax.swing.*;

public class CharArraySorting {
    public static void main(String[] args) {
        String text = "Init array:\n";
        int size = Integer.parseInt(JOptionPane.showInputDialog("Get size of array:"));

        char[] symbs = new char[size];
        char s = 'a';

        for (int i = 0; i < size; i++) {
            symbs[i] = (char) (s + (byte)(Math.random() * 26));
            text += symbs[i] + " ";
        }

        text += "\nAfter sort:\n";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (symbs[j] > symbs[j + 1]) {
                    s = symbs[j + 1];
                    symbs[j + 1] = symbs[j];
                    symbs[j] = s;
                }
            }
        }

        for (int i = 0; i < size; text += symbs[i] + " ",  i++);

        JOptionPane.showMessageDialog(null, text);
    }
}
