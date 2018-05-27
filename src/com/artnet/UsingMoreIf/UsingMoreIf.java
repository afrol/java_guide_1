package com.artnet.UsingMoreIf;

import javax.swing.*;

public class UsingMoreIf {
    public static void main(String[] args) {
        String inputText, msg;

        inputText = JOptionPane.showInputDialog("Input number:");
        if (inputText == null || inputText.equals("")) {
            System.exit(JOptionPane.ERROR_MESSAGE);
        }

        int number = Integer.parseInt(inputText);

        if (number < 0) {
            msg = "Number less zero";
        } else if (number > 100) {
            msg = "Number more 100";
        } else if (number > 10) {
            msg = "Number more 10";
        } else if (number > 0 & number < 10) {
            msg = "Number beetwen 0 - 10";
        } else {
            msg = "Upc :)";
        }


        JOptionPane.showMessageDialog(null, msg);
    }
}
