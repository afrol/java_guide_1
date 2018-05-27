package com.artnet.AssignObjDemo;

import javax.swing.*;

class AssignObj {
    public String text;

    public AssignObj() {
        text = "Init text";
    }

    public AssignObj(String s) {
        text = s;
    }

    public void show() {
        JOptionPane.showMessageDialog(null, text);
    }
}

public class AssignObjDemo {
    public static void main(String[] args) {
        AssignObj obj1 = new AssignObj();
        AssignObj obj2 = new AssignObj("Second obj");

        obj1.show();
        obj2.show();

        obj1 = obj2;

        obj1.show();
        obj2.text = "Change text 2";
        obj1.show();
    }
}
