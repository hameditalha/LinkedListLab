package LinkedListTesting;

import java.util.*;

public class DriverClass {

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        System.out.println(list.isEmpty());
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.displayList();
        System.out.println(list.getFirst());
        list.deleteFirst();
        System.out.println(list.getFirst());
        System.out.println(list.findNode(3));
        System.out.println(list.deleteNode(2));
        list.displayList();
        System.out.println(list.isEmpty());
    }
}