package com.artnet.whatname;

import javax.swing.*;

public class WhatIsYourName {
    public static void main(String[] args) {
        String name;

        name = JOptionPane.showInputDialog("Hi! How are you?");
        JOptionPane.showMessageDialog(null, "Nice, \n" + name + "!");
    }
}
