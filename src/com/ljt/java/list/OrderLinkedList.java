package com.ljt.java.list;

public class OrderLinkedList {

    private Node head;

    private class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public OrderLinkedList(Node head) {
        this.head = head;
    }

    public void insret(int value){
        Node node = new Node(value);
        Node pre = null;
        Node current = head;
        while (current!=null && value > current.data ){
            pre = current;
            current = current.next;
        }
        if(pre == null){
            head = node;
            head.next = current;
        }else {
            pre.next = node;
            node.next = current;
        }
    }

    public void deleteHead(){
        head = head.next;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
