package com.artnet.ArraysAndObjs;

class First {
    private int[] nums;

    First(int n) {
        nums = new int[n];

        nums[0] = nums[1] = 1;

        for (int i = 2; i < n; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
    }

    void show() {
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}

class Second {
    private First obj;

    Second(int n) {
        obj = new First(n);
        obj.show();
    }
}

public class ArraysAndObjs {

    final private static int count = 5;

    public static void main(String[] args) {
        Second[] ObjAr = new Second[ArraysAndObjs.count];

        for (int i = 0; i < ObjAr.length; i++) {
            ObjAr[i] = new Second(3 * i + 4);
        }
    }
}
