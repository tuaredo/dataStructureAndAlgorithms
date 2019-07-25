package com.ljt.java.stack;

import org.junit.Test;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
//        MyStack myStack = new MyStack(3);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        System.out.println(myStack.peek());
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }

        String input;
        System.out.println("Enter infix:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        InfixToSuffix in = new InfixToSuffix(input);
        MyCharStack my = in.doTrans();
        my.displayStack();
    }



    @Test
    public void testInfixToSuffix(){
        String input;
        System.out.println("Enter infix:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        InfixToSuffix in = new InfixToSuffix(input);
        MyCharStack my = in.doTrans();
        my.displayStack();
    }
}
