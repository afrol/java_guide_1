package com.artnet.usinginteger;

import javax.swing.*;

public class UsingInteger {
    final static private String ROOT_DIR = "__DIR__";

    public static void main(String[] args) {
        int number = 132;
        String noNumber = "123";
        int aNumber = Integer.parseInt(noNumber);
        String title1 = "Command number + number";
        String title2 = "Command number + aNumber";
        int type1 = JOptionPane.WARNING_MESSAGE;
        int type2 = JOptionPane.ERROR_MESSAGE;

        JOptionPane.showMessageDialog(null, number + noNumber, title1, type1);
        JOptionPane.showMessageDialog(null, number + aNumber, title2, type2);
        System.out.println(UsingInteger.ROOT_DIR);
        System.out.println(true ^ false ^ false | true);
    }
}
