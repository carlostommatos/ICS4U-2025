package stacksAndQueues;


public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        boolean ans;
        if (this.front == null) {
            ans = true;
        }
        else {
            ans = false;
        }
        return ans;
    }

    public void enqueue(int item) {
        Node newItem = new Node(item);
        newItem.setNext(this.rear);
        this.rear = newItem;

        if (this.front == null) {
            this.front = newItem;
        }
    }

    public int dequeue() {
        Node dequeued = this.front;
        Node thirdNode = this.rear;
        if (this.front == null) {
            throw new IllegalStateException("Can't pop and empty stack.");
        }
        else {
            if (this.rear.getNext() == null)
                return dequeued.getData();
            else if (this.rear.getNext().getNext() == null)
                System.out.println(this.rear.getNext());
            }
        return dequeued.getData();
    }

    public String toString() {
        String data = "";
        Node current = this.rear;
        while (current != null) {
            data = data + current.toString() + "\n";
            current = current.getNext();
        }
        return data;
    }

    public int viewFirst() {
        return this.front.data;
    }

    public int viewLast() {
        return this.rear.data;
    }

    public int size() {
        if (this.isEmpty())
            return 0;
        int i = 1;
        Node current = this.front;
        while (current.getNext() != null) {
            i++;
            current = current.getNext();
        }
        return i;
    }

    public int viewTop() {
        return this.front.data;
    }



    private class Node {
    //Field definitions
    private int data;  //Data stored in a node
    private Node next;    //Pointer to the next node
    private Node previous; // Pointer to the previous node

    public Node (int data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    } //Constructor 1 - used to make the first node
    // or to make a node that is at the tail end

    //Accessors
    public int getData ()
    {
        return this.data;
    }

    public Node getNext ()
    {
        return this.next;
    }

    //Mutators
    public void setData (int data)
    {
        this.data = data;
    }

    public void setNext (Node next)
    {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    public String toString ()
    {
        String data1 = "";
        //Check if node is the tail node
        if (this.next != null)
        {
            data1 = "Item: " + this.data + " is on top of " + this.next.getData ();
        }
        else
        {
            data1 = "Item: " + this.data + " is at the bottom of the stack";
        } //end if

        return data1;

    }
} //Node class
}
