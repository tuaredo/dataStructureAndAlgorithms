package com.ljt.java.sort;

/**
 * 冒泡
 */
public class BubbleSort {

    public static int[] sort(int[] array){
        int k = 0;
        for(int i=0;i<array.length;i++){
            boolean flag =true;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    k = array[j+1];
                    array[j+1] = array[j];
                    array[j] = k;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return array;
    }

    public static void display(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static int[] showArray(){
        int[] array = {4,2,8,9,5,7,6,1,3};
        System.out.println("未排序数组顺序为：");
        display(array);
        return  array;
    }

    public static void main(String[] args) {
        int[] array =  showArray();
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }
}
