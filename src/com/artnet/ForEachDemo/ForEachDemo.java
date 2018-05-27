package com.artnet.ForEachDemo;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] a = new int[] {1,233,4,9,5,6,7,8};

        for (int s:a) {
            System.out.print(s + " ");
        }

        int i, j, s;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    s = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = s;
                }
            }
        }
        s = 0;
        System.out.println();
        for (int s1:a) {
            System.out.print(s1 + " ");
        }
    }
}
