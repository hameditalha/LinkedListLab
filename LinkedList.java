package LinkedListTesting;

//import java.util.*;

public class LinkedList {

    private Node first;

    public LinkedList() { first = null; }

    public int getFirst()  {   return first.getData();}
    public void setFirst(Node value)  {   this.first = value;}

    public boolean isEmpty() {   return (first == null);   }

    public void insertFirst(int d)
    {
        Node newNode = new Node(d);
        newNode.setNext(first);
        first = newNode;
    }

    public Node deleteFirst()
    {
        Node temp = first;
        first = first.getNext();
        return temp;
    }

    public void displayList()
    {
        System.out.println("list from first to last");
        Node current = first;
        while(current != null)
        {
            current.displayNode();
            current = current.getNext();
        }
    }

    public Node findNode(int d)
    {
        Node current = first;
        while(current.getData() != d)
        {
            if (current.getNext() == null)
            {
                return null;
            }
            else current = current.getNext();
        }
        return current;
    }

    public Node deleteNode(int d)
    {
        Node current = first;
        Node previous = first;
        while(current.getData() != d)
        {
            if ( current.getNext() == null)
            {
                return null;
            }
            else
            {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == first){first = first.getNext();}
        else {previous.setNext(current.getNext());}

        return current;
    }
}
