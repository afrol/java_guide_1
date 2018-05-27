package com.artnet.overload;

import javax.swing.*;

public class OverloadMethod {
    public static void main(String[] args) {
        OverloadContext obj1 = new OverloadContext();
        OverloadContext obj2 = new OverloadContext(2);
        OverloadContext obj3 = new OverloadContext('c');
        OverloadContext obj4 = new OverloadContext(3, 'A', "Tree params define");
    }
}

class OverloadContext {
    private int num;
    private char symb;
    private String text;

    OverloadContext() {
        set();
        showText();
    }

    OverloadContext(int n) {
        set(n);
        showText();
    }

    OverloadContext(char s) {
        set(s);
        showText();
    }

    OverloadContext(int n, char s, String str) {
        set(n, s, str);
        showText();
    }

    private void set(int n, char s, String str) {
        num = n;
        symb = s;
        text = str;
    }

    private void set() {
        num = 0;
        symb = 'a';
        text = "Not args";
    }

    private void set(int n) {
        num = n;
        symb = 'b';
        text = "Integer argument";
    }

    private void set(char s) {
        num = 1;
        symb = s;
        text = "Char arg";
    }

    private void showText() {
        String str = "Define var of object:\n";

        str += "num=" + num + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text + "\n";

        JOptionPane.showMessageDialog(null, str);
    }
}
