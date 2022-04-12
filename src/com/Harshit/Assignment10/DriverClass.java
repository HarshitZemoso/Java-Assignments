package com.Harshit.Assignment10;



/*
 *Create a generic, singly linked list class called SList,
 * Each Link object in the list should contain a reference to the next element in the list, but not the previous one
 * Create your own SListIterator which, again for simplicity, does not implement ListIterator.
 * The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
 * The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.

 */

public class DriverClass {
    public static void main(String[] args) {


        SList<Integer> list = new SList<Integer>();
        SListIterator it = list.iterator();
        it.insert(10);
        it.insert(12);
        it.insert(13);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
it.remove();
        it.insert(20);
        System.out.println(it.next());
        System.out.println(it.hasNext());

        SListIterator it2=list.iterator();
        while (it2.hasNext())
        {
            System.out.println(it2.next());
        }
        SListIterator it3 = list.iterator();
it3.remove();
it3.next();
it3.remove();
        while (it3.hasNext())
        {
            System.out.println(it3.next());
        }


    }
}
