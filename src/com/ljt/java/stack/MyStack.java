package com.ljt.java.stack;

public class MyStack {

    private int[] array;
    private int maxSzie;
    private int top;

    public MyStack(int size) {
        this.maxSzie = size;
        array = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top<maxSzie-1){
            array[++top] = value;
        }
    }

    public int pop(){
        return array[top--];
    }


    public int peek(){
        return array[top];
    }


    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == maxSzie-1);
    }
}
