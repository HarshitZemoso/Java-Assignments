package com.Harshit.Assignment10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        SList<Integer> list = new SList<>();
        SListIterator<Integer> sListIterator = list.iterator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nummber of nodes you wish to create");
        int nodes = sc.nextInt();
        System.out.print("Enetr Data of Nodes");
        for (int i = 0; i <nodes ; i++) {
            int data = sc.nextInt();
            sListIterator.insertNode(data);
        }

        sListIterator.printList();

        sListIterator.deleteNode(2);
        sListIterator.deleteNode(4);
        sListIterator.deleteNode(6);
//        sListIterator.deleteNode(8);

        sListIterator.printList();
    }
}