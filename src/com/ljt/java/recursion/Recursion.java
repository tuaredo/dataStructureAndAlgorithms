package com.ljt.java.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 递归
 */
public class Recursion {

    public static void main(String[] args) {
//        System.out.println(getFactorialFor(2));
//        int[] i = new int[3];
//        List list = new ArrayList<>();
//        int [] array = {1,3,4,5,7,9,12,14,15,17,25,26,37};
//        System.out.println("下标："+search(array,8,0,array.length));

//        move(3,"A","B","C");
        int[] c = {2,7,8,3,1,6,9,0,5,4};
        c = mergeSort(c,0,c.length-1);
        System.out.println(Arrays.toString(c));
    }
    public static int getFactorialFor(int i){
        if(i >= 0){
            if(i==1||i==0){
                return 1;
            }else {
                return i*getFactorialFor(--i);
            }
        }
        return -1;
    }

    //二分查找
    public static int search(int[] array,int key,int low,int high){
        int mid = (high-low)/2 + low;
        if(key == array[mid]){
            return  mid;
        }else if(low > high){
            return  -1;
        }else {
            if(key < array[mid]){
                return search(array,key,low,mid-1);
            }
            if(key > array[mid]){
                return search(array,key,mid+1,high);
            }
        }
        return -1;
    }
    //汉诺塔
    public static void move(int num,String from,String temp,String to){
        if(num == 1){
            System.out.println("将盘子 "+num+"从塔 "+from+"搬到 "+to);
        }else {
            move(num-1,from,to,temp);//A为初始塔座，B为目标塔座，C为中介塔座
            System.out.println("将盘子 "+num+"从塔 "+from+"搬到 "+to);
            move(num-1,temp,from,to);//B为初始塔座，C为目标塔座，A为中介塔座
        }
    }

    //归并排序
    public static int[] sort(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        int aNum = 0;int bNum = 0;int cNum = 0;
        while (aNum<a.length && bNum<b.length){
            if(a[aNum] < b[bNum]){
                c[cNum++] = a[aNum++];
            }else {
                c[cNum++] = b[bNum];
            }
        }

        while (aNum == a.length && bNum<b.length){
            c[cNum++] = b[bNum++];
        }

        while (bNum == b.length && aNum<a.length){
            c[cNum++] = a[aNum++];
        }

        return c;
    }

    public static int[] mergeSort(int[] c,int start,int last){
        if(last > start){
            int mid = (last - start)/2 + start;
            mergeSort(c,start,mid);
            mergeSort(c,mid+1,last);
            merge(c,start,mid,last);
        }
        return c;
    }

    public static void merge(int[] c,int start,int mid,int last){
        int[] temp = new int[last - start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= last){
            if(c[i] < c[j]){
                temp[k++] = c[i++];
            }else {
                temp[k++] = c[j++];
            }
        }

        while (i<=mid){
            temp[k++] = c[i++];
        }
        while (j<=last){
            temp[k++] = c[j++];
        }
        for(int k2 = 0;k2<temp.length;k2++){
            c[k2+start] = temp[k2];
        }
    }


    public static int pow(int x,int y){
        if(x == 0|| x==1){
            return x;
        }
        if(y > 1){
            int b= y/2;
            int a=x*x;
            if(y%2==1){
                return pow(a,b)*x;
            }else {
                return pow(a,b);
            }
        }else if(y==0){
            return 1;
        }else {
            return x;
        }
    }
}