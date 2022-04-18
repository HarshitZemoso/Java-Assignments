package com.Harshit.Assignment10;
public class SListIterator<T> {

    Node<T> head;
    Node<T>tail;

    public SListIterator(){
        head = null;
        tail = null;
    }

    public void insertNode(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void deleteNode(T value){
        Node<T> tempNode = head;
        Node<T> previousNode = null;

        if(head.value == value){
            head = tempNode.next;
            return;
        }
        while(tempNode != null)
        {
            if(tempNode.value == value){
                previousNode.next = tempNode.next;
            }
            previousNode = tempNode;
            tempNode = tempNode.next;
        }

    }

    public void printList() {
        Node<T> tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.value+"->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

}