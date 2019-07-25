package com.ljt.java.sort;

/**
 * 选择
 */
public class ChoiceSort extends BubbleSort {

    public static int[] sort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            if(min != i){
                int k = array[min];
                array[min] = array[i];
                array[i] = k;
            }
        }
        return array;
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
