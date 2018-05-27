package com.artnet.UsingSwitch;

import javax.swing.*;

public class UsingSwitch {
    public static void main(String[] args) {
        String inputText, msg;
        int num;

        inputText = JOptionPane.showInputDialog("Past number in range: 0 .. 10");
        if (inputText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "WTF", "Mamamiy", JOptionPane.ERROR_MESSAGE);
            System.exit(JOptionPane.ERROR_MESSAGE);
        }

        switch (Integer.parseInt(inputText)) {
            case 0:
                msg = "You write zero";
                break;

            case 1:
                msg = "You write one";
                break;

            case 3:
            case 5:
            case 7:
                msg = "You wrote natural number";
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                msg = "Yo wrote odd";
                break;

            default:
                msg = "You wrote 9 or \n out of range";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
