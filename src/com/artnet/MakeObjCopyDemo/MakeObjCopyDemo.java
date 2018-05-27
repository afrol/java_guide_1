package com.artnet.MakeObjCopyDemo;

class ObjCopy {
    String name;
    int num;

    ObjCopy(String name, int num) {
        this.name = name;
        this.num = num;
    }

    ObjCopy(ObjCopy obj) {
        name = obj.name;
        num = obj.num;
    }

    /**
     * @return ObjCopy
     */
    ObjCopy copy() {
        return new ObjCopy(this);
    }

    public void show() {
        String text = "Fileds of obj:\n";

        text += "name=" + name + "num=" + num;

        System.out.println(text);
    }
}

public class MakeObjCopyDemo {
    public static void main(String[] args) {
        ObjCopy obj1 = new ObjCopy("Object Id", 100);
        ObjCopy obj2 = new ObjCopy(obj1);

        obj1.show();
        obj2.show();

        obj2.name = "Object 2";
        obj2.num = 200;

        obj1.show();
        obj2.show();

        obj1 = obj2.copy();

        obj2.name = "object 3";

        obj1.show();
        obj2.show();
    }
}
