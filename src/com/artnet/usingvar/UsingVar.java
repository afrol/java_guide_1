package com.artnet.usingvar;

import javax.swing.*;

public class UsingVar {
    public static void main(String[] args) {
        String name = "Mark Shelton";
        int age = 40;
        char category = 'B';
        String text = "Driver " + name;
        text += "\n" + "Age " + age + " old";
        text += "\n" + "Driver id category " + category;

        JOptionPane.showMessageDialog(null, text);
    }
}
