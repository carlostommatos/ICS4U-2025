package stacksAndQueues;

/*
Queue
linked list style of data structure
Carlos Matos
Monday, December 1, 2025
 */

public class Queue {

    // fields for a queue
    // a queue must keep track of the front
    // and rear of the line
    private Node front;
    private Node rear;

    // constructor creates a queue
    public Queue() {
        this.front = null;
        this.rear = null;
    }



    // method to check if items are in the queue
    public boolean isEmpty() {
        if (this.front == null) {
            return true;
        }
        else {
            return false;
        }
    } // isEmpty method

    // method to provide the number of
    // items in the queue
    public int size() {

        // you get an error without this
        // because null
        if (this.isEmpty())
            return 0;

        int i = 1; // counts how many items are in the stack
        Node current = this.front; // start with the top node
        while (current.getNext() != null) { // repeat until the last node
            i++;
            current = current.getNext(); // move to the next node
        }
        return i; // return how many nodes are in the stack
    } // size method


    // method to add a new item to the back of a queue
    public void enqueue(String item) {
        // create a new node that holds
        // the data from the client
        Node newItem = new Node(item);

        // if the front is null,
        // the queue is empty
        if (this.front == null) {
            // the new item becomes the front
            // and the rear because there
            // is only 1 item in the queue
            this.front = newItem;
            this.rear = newItem;
        }

        // if there is at least 1 item in the queue
        else {
            // make the rear point to the new item
            this.rear.setNext(newItem);
            // make the new item the rear
            this.rear = newItem;
        }
    } // enqueue method

    // method to remove the front item of a queue
    public String dequeue() {
        // create a new node that
        // holds the current top
        Node dequeued = this.front;

        // make sure there is an item to dequeue
        if (this.front != null) {
            // reset the queue's top to the
            // next node in the stack
            this.front = this.front.getNext();

            // if there was only one item in the queue
            // make sure the rear is also null
            // because the queue is now empty
            if (this.front == null) {
                this.rear = null;
            }

            // send the data from the original
            // top to the client
            return dequeued.getData();
        }

        else { // if the queue has nothing in it
            throw new IllegalStateException ("Can't dequeue an empty queue.");
        }
    } // dequeue method


    public String toString()
    {
        String data="";
        Node current = this.front;
        while (current != null)
        {
            data = data + current.toString() + "\n";
            current = current.getNext(); //Advance through the stack
        }
        return data;

    }//



    // allow the client to view (but not dequeue)
    // the front item in the queue
    public String viewFront() {
        return this.front.data;
    }

    // allow the client the view (but not dequeue)
    // the rear item in the queue
    public String viewRear() {
        return this.rear.data;
    }



    //Individual Node class - for items in the stack
    private class Node
    {
        //Field definitions
        private String data;  //Data stored in a node
        private Node next;    //Pointer to the next node

        public Node (String data)
        {
            this.data = data;
            this.next = null;
        } //Constructor 1 - used to make the first node
        // or to make a node that is at the tail end

        //Accessors
        public String getData ()
        {
            return this.data;
        }


        public Node getNext ()
        {
            return this.next;
        }

        //Mutators
        public void setData (String data)
        {
            this.data = data;
        }

        public void setNext (Node next)
        {
            this.next = next;
        }

        public String toString ()
        {
            String data1 = "";
            //Check if node is the tail node
            if (this.next != null)
            {
                data1 = "Item: " + this.data + " is in front of " + this.next.getData ();
            }
            else
            {
                data1 = "Item: " + this.data + " is at the back of the queue";
            } //end if

            return data1;

        }
    } //Node class


}
