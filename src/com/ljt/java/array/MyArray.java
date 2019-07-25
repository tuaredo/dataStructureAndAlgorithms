package com.ljt.java.array;

import java.time.temporal.ValueRange;

public class MyArray {

    private int[] intArrays;

    private int elems;

    private int length;

    public MyArray() {
        elems = 0;
        length = 50;
        intArrays = new int[length];
    }

    public MyArray(int length) {
        elems = 0;
        this.length = length;
        intArrays = new int[length];
    }

    public int getSize(){
        return elems;
    }

    public void display(){
        for(int i=0;i<elems;i++){
            System.out.print(intArrays[i]+" ");
        }
        System.out.println();
    }


    public boolean add(int value){
        if(elems == length){
            System.out.println("超出界限");
            return false;
        }
        intArrays[elems] = value;
        elems++;
        return true;
    }

    public int get(int index){
        try {
            if(index<0 || index>elems){
                System.out.println("下标越界");
                throw  new RuntimeException("下标越界");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return intArrays[index];
    }


    public int find(int searchValue){
        int i;
        for (i=0;i<elems;i++){
            if(searchValue == intArrays[i]){
                break;
            }
        }
        if(i == elems){
            return -1;
        }
        return i;
    }


    public boolean delete(int value){
        int k = find(value);
        if(k == -1){
            return false;
        }else{
            if(k == elems-1){
                elems--;
            }else{
                for(int i=k;i<elems-1;i++){
                    intArrays[i] = intArrays[i+1];
                }
                elems--;
            }
            return true;
        }
    }

    public boolean edit(int oldValue,int newValue){
        int k = find(oldValue);
        if(k == -1){
            System.out.println("需要修改的数据不存在");
            return false;
        }
        intArrays[k] = newValue;
        return true;
    }
}
