package com.ljt.java.stack;

import sun.font.CompositeGlyphMapper;

import javax.swing.*;
import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private Object[] elementData;
    private int top;
    private int size;

    public ArrayStack() {
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    public ArrayStack(int size) {
        if(size<0){
            throw new IllegalArgumentException("栈初始容量不能小于0:"+size);
        }
        this.size = size;
        this.elementData = new Object[size];
        this.top = -1;
    }

    public Object push(Object item){
        isGrow(top+10);
        elementData[++top] = item;
        return item;
    }

    public Object pop(){
        Object obj = peek();
        remove(top);
        return obj;
    }

    public Object peek(){
        if(top == -1){
            throw new EmptyStackException();
        }
        return elementData[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void remove(int top){
        elementData[top] = null;
        this.top--;
    }

    public boolean isGrow(int minCapacity){
        int oldCapacity = size;

        if(minCapacity >= oldCapacity){
            int newCapacity = 0;
            if((oldCapacity<<1) - Integer.MAX_VALUE>0){
                newCapacity = Integer.MAX_VALUE;
            }else{
                newCapacity = (oldCapacity<<1);
            }
            this.size = newCapacity;
            elementData = Arrays.copyOf(elementData,size);
            return true;
        }else {
            return false;
        }
    }
}
