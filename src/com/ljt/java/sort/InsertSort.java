package com.ljt.java.sort;

/**
 * 插入
 */
public class InsertSort extends BubbleSort {

    public static int[] sort(int[] array){
        int j;
        for(int i=1;i<array.length;i++){
            int tmp = array[i];
            j = i;
            while (j>0&&tmp<array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array =  showArray();
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过插入排序后的数组顺序为：");
        display(array);
    }
}
