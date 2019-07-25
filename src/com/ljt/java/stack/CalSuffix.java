package com.ljt.java.stack;

public class CalSuffix {

    private MyCharStack stack;
    private String input;

    public CalSuffix(String input) {
        this.input = input;
        stack = new MyCharStack(input.length());
    }

    public int doCal(){
        int num1,num2,result;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c >= '0' && c<= '9'){
                stack.push((char)(c-'0'));
            }else {
                num2 = (int)(stack.pop());
                num1 = (int)(stack.pop());
                //System.out.println(num1+" "+num2);
                switch (c){
                    case '+':
                        result = num1+num2;
                        break;
                    case '-':
                        result = num1-num2;
                        break;
                    case '*':
                        result = num1*num2;
                        break;
                    case '/':
                        result = num1/num2;
                        break;
                        default:result = 0;
                        break;
                }
                stack.push((char)result);
            }
        }
        result = (int)stack.pop();
        return result;
    }


    public static void main(String[] args) {
        //中缀表达式：1*(2+3)-5/(2+3) = 4
        //后缀表达式：123+*123+/-
        CalSuffix cs = new CalSuffix("123+*523+/-");
        System.out.println(cs.doCal()); //6
    }
}
