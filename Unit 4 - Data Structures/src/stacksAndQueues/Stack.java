package stacksAndQueues;

public class Stack
{

    //Fields for a stack
    private Node top;   //Only need to keep track of the top item in stack

    //Constructor creates an stack
    public Stack ()
    {
        this.top = null;
    }


    //Method to check if items are in stack
    public boolean isEmpty ()
    {
        boolean ans;
        if (this.top == null)
        {
            ans = true;
        }
        else
        {
            ans = false;
        }

        return ans;

        //return (this.top==null);

    }


    //Method to add a new item to the stack
    public void push (int item)
    {
        Node newItem = new Node (item); //Create a new node that
        //holds the data from the client

        newItem.setNext(this.top);   //Make new item point to the
        //top node of the existing stack
        this.top = newItem; //Set the new top of the stack

    }//push method


    //Method to pop off the top item in a stack
    //Make sure to check for an empty stack
    //Return the data that was popped
    public int pop()
    {
        Node popped = this.top;  //Make a node that holds the current top
        //Make sure there is an item to pop
        if (this.top != null)
        {
            this.top = this.top.getNext();  //Reset the stack's top to the next node in the stack
            return popped.getData();  //Send to the client the data from the original top

        }
        else //What if the stack has nothing in it?
        {
            throw new IllegalStateException ("Can't pop an empty stack.");
        }//end if



    }//pop method

    public String toString()
    {
        String data="";
        Node current = this.top;
        while (current != null)
        {
            data = data + current.toString() + "\n";
            current = current.getNext(); //Advance through the stack
        }
        return data;

    }//



    // counts and returns the total number of items in the stack
    public int size() {

        // you get an error without this because null
        if (this.isEmpty())
            return 0;

        int i = 1; // counts how many items are in the stack
        Node current = this.top; // start with the top node
        while (current.getNext() != null) { // repeat untl the last node
            i++;
            current = current.getNext(); // move to the next node
        }
        return i; // return how many nodes are in the stack
    } // size method


    // allow the client to view (but not pop) the top item in the stack
    public int viewTop() {
        return this.top.data;
    }


    //Individual Node class - for items in the stack
    private class Node
    {
        //Field definitions
        private int data;  //Data stored in a node
        private Node next;    //Pointer to the next node

        public Node (int data)
        {
            this.data = data;
            this.next = null;
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
