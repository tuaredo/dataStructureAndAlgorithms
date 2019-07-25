package com.ljt.java.stack;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 *
 */
public class MyCharStack {
    private char[] array;
    private int maxSize;
    private int top;

    public MyCharStack(int maxSize) {
        this.maxSize = maxSize;
        array = new char[maxSize];
        top = -1;
    }


    public void push(char value){
        if(top < maxSize-1){
           array[++top] = value;
        }
    }

    public char pop(){
        return array[top--];
    }

    public char peek(){
        return array[top];
    }

    public char peekN(int n){
        return array[n];
    }

    public void displayStack(){
        System.out.print("Stack(bottom-->top):");
        for(int i=0;i<top+1;i++){
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }


}
