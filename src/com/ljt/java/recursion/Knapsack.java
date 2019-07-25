package com.ljt.java.recursion;

import com.sun.corba.se.impl.oa.toa.TOA;
import com.sun.org.apache.regexp.internal.REUtil;
import javafx.beans.binding.BooleanExpression;

/**
 * 背包问题
 */
public class Knapsack {

    private  int[] weights;
    private boolean[] selects;

    public Knapsack(int[] weights) {
        this.weights = weights;
        selects = new boolean[weights.length];
    }

    /**
     *
     * @param total 总重量
     * @param index 可供选择的重量下标
     */
    public void knapsack(int total,int index){
        if(total<0 || total>0 && index>=weights.length){
            return;
        }
        if(total == 0){
            for(int i=0;i<index;i++){
                if(selects[i] == true){
                    System.out.println(weights[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        selects[index] = true;
        knapsack(total - weights[index],index+1);
        selects[index] = false;
        knapsack(total,index+1);
    }

    public static void main(String[] args) {
        int[] array = {11,9,7,6,5};
        int total = 20;
        Knapsack k = new Knapsack(array);
        k.knapsack(total,0);
    }
}


