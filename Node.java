package LinkedListTesting;

public class Node {

    private int data;
    private Node next;

    public Node()
    {
        data = 0;
        next = null;
    }

    public Node(int d)
    {
        data = d;
    }

    public void displayNode() { System.out.println(data +" and "+ next +"\n");}

    public int getData() {  return this.data;    }
    public void setData(int value)  {   this.data = value;    }

    public Node getNext()   {   return this.next;    }
    public void setNext(Node value) {   this.next = value;  }

}
