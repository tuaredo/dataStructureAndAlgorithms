package com.ljt.java.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

/**
 * 中缀转后缀
 */
public class InfixToSuffix {
    private MyCharStack s1;
    private MyCharStack s2;
    private String input;

    public InfixToSuffix(String input) {
        this.input = input;
        s1 = new MyCharStack(input.length());
        s2 = new MyCharStack(input.length());
    }

    public InfixToSuffix() {
    }

    public MyCharStack doTrans(){
        for(int j=0;j<input.length();j++){
            System.out.print("s1元素为:");
            s1.displayStack();
            System.out.print("s2元素为:");
            s2.displayStack();
            char ch = input.charAt(j);
            System.out.println("当前解析的字符:"+ch);
            switch (ch){
                case '+':
                case '-':
                    gotOper(ch,1);
                    break;
                case '*':
                case '/':
                    gotOper(ch,2);
                    break;
                case '(':
                    s1.push(ch);
                    break;
                case ')':
                    gotParen();
                    break;
                    default:
                        s2.push(ch);
                        break;
            }

        }
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2;

    }

    public void gotOper(char opThis,int prec1){
        while (!s1.isEmpty()){
            char opTop = s1.pop();
            if(opTop == '('){
                s1.push(opTop);
                break;
            }else {
                int prec2;
                if(opTop == '+' || opTop=='-'){
                    prec2 = 1;
                }else {
                    prec2 = 2;
                }
                if(prec2<prec1){
                    s1.push(opTop);
                    break;
                }else {
                    s2.push(opTop);
                }
            }
        }

        s1.push(opThis);
    }

    public void gotParen(){
        while (!s1.isEmpty()){
            char chx = s1.pop();
            if(chx == '('){
                break;
            }else s2.push(chx);
        }
    }


}
