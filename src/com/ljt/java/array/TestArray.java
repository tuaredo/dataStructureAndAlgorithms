package com.ljt.java.array;

public class TestArray {
    public static void main(String[] args) {
        MyArray array = new MyArray(4);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        array.display();

        int i = array.get(0);
        System.out.println(i);

        array.delete(4);

        array.edit(3,33);
        array.display();
    }

}
