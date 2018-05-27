package com.artnet.SimpleArray;

import javax.swing.*;

public class SimpleArray {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Array from odd number:\n");

        int size = Integer.parseInt(JOptionPane.showInputDialog("Set array size:"));

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = 2 * i + 1;
            text.append(nums[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, text.toString());
    }
}
