package com.ljt.java.stack;

public class TestArrayStack {
    public static void main(String[] args) {
//        ArrayStack stack = new ArrayStack(3);
//        stack.push(1);
//        //System.out.println(stack.peek());
//        stack.push(2);
//        stack.push(3);
//        stack.push("abc");
//        System.out.println(stack.peek());
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println(stack.peek());

//        ArrayStack arrayStack = new ArrayStack(3);
//        String str = "how are you";
//        char[] chars = str.toCharArray();
//        for(char c : chars){
//            arrayStack.push(c);
//        }
//        while (!arrayStack.isEmpty()){
//            System.out.print(arrayStack.pop());
//        }

        ArrayStack arrayStack = new ArrayStack(3);
        String str = "12<[b{c}]>}";
        char[] chars = str.toCharArray();
        for(char c:chars){
            switch (c){
                case '{':
                case '[':
                case '<':
                    arrayStack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if(!arrayStack.isEmpty()){
                        char ch = arrayStack.pop().toString().toCharArray()[0];
                        if(c=='}'&& ch!='{'
                                || c=='>'&& ch!='<'
                                || c==']'&& ch!='['){
                            System.out.println("Error:"+ch+"-"+c);
                        }
                    }else {
                        System.out.println("Error:"+c);
                    }
                    break;
                    default:break;
            }
        }
    }
}
