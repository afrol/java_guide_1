package com.artnet.StatMethDemo;

import javax.swing.*;

class MyMath {
    final static double PI = 3.1415;

    public static double sin (double x, int n) {
        double s = 0, q = x;

        for (int i = 1; i <= n; i++) {
            s += q;
            q *= (-1) *x*x/(2*i)/(2*i+1);
        }
        return s + q;
    }
}

public class StatMethDemo {
    public static void main(String[] args) {
        String text = "Var for Tailor";
        int accuracy = 5;

        for (int i = 0; i <= accuracy; i++) {
            text += "\nSumm:" + (i + 1) + "\n";
            text += "sin(pi/" + accuracy + ")=" + MyMath.sin(MyMath.PI / accuracy, i);
        }

        JOptionPane.showMessageDialog(null, text);
    }
}
