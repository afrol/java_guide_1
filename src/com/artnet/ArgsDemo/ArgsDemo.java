package com.artnet.ArgsDemo;

class MyClass {
    int number;
    char symbl;

    MyClass (int number, char symbol) {
        this.number = number;
        this.symbl = symbol;
    }

    public void show() {
        System.out.println("Filed: " + number + " " + symbl);
    }
}

public class ArgsDemo {
    private static void makeChange(MyClass obj) {
        obj.symbl++;
        obj.number++;

        String text = "Args " + obj.number + " " + obj.symbl;
        System.out.println(text);
    }

    private static void  makeChange(int number, char symb) {
        number++;
        symb++;

        String text = "Args " + number + " " + symb;
        System.out.println(text);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(1, 'a');
        obj.show();

        makeChange(obj);
        obj.show();

        makeChange(obj.number, obj.symbl);
        obj.show();
    }
}
