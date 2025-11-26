package linkedLists;

//An example of  NESTED classes (a class within a class)
// LinkedList is the OUTER class, Node is the INNER/NESTED class
// Node is considered a member of the LinkedList class so it has access
// to the Outer class' stuff

public class LinkedList
{
    private Node headNode;   //For a linked list, all we ever need to keep
    //track of is the head node

    public LinkedList ()
    {
        this.headNode = null;
    } //Constructor 1 - which sets up a null node


    public LinkedList (String data)
    {
        Node newFirstNode = new Node (data);
        this.headNode = newFirstNode;
    } //Constructor 2 - which sets up the head node with a node instantiated by


    //data supplied by client


    public Node getHeadNode ()
    {
        return this.headNode;
    } //accessor for head node


    public void setHeadNode (Node headNode)
    {
        this.headNode = headNode;
    } //mutator for head node


    //Behavioural methods
    public void addNodeAtFront (String data)
    {
        //Create a new node with the data from the client
        Node newFrontNode = new Node (data);

        //Make sure there is at least one node in the linked list
        //If not, then make this new node the head node
        if (this.headNode == null)
        {
            this.headNode = newFrontNode;
        }
        else    //There is a head node, so just have new node point
        //to head node.  Then new node becomes the head node.
        {
            newFrontNode.setNext (this.headNode);
            this.headNode = newFrontNode;
        }

    } //addNodeAtFront


    public void addNodeOnEnd (String data)
    {
        //Create a new node with the data from the client
        Node newEndNode = new Node (data);

        //Make sure linked list has a node
        if (this.headNode == null)
        {
            //List was empty, so new node is just added
            //as the head node
            this.headNode = newEndNode;

        }
        else
        {
            //Traverse to find the tail
            //current is a node object that takes on
            //the value of each node
            Node current = this.headNode;

            //Keep going through list as long as the
            //pointer is not pointing at null
            while (current.getNext () != null)
            {
                //Move to the next node
                current = current.getNext ();
            }

            //Once out of the loop, current is the tail
            //node of the list
            //Make the tail node point to the new node
            //added to the list
            current.setNext (newEndNode);

        } //end if

    } //addNodeOnEnd




    public String toString ()
    {
        //We need to access the toString from the Node class
        //which outputs fields of one node object, in order
        //to output the linked list

        //Traverse
        Node current = this.headNode;
        String linkStuff = "";

        while (current != null)
        {
            linkStuff = linkStuff + current.toString () + "\n";
            //advance the node
            current = current.getNext ();
        } //end while


        //Check that list wasn't empty
        if (linkStuff.equals (""))
        {
            linkStuff = "The list is empty.";
        } //end if


        return linkStuff;

    } //toString



    // counts how many times a piece of data occcurs in the list
    public int howManyNodes(String data) {
        int i = 0; // counts how many times the data is in the list
        Node current = this.getHeadNode(); // start at the first node
         do { // check every node
             // if the node has the data we're looking for
            if (current.getData().equals(data))
                i++; // add 1 to the counter
            current = current.getNext(); // check the next node
        }
        while (current != null); // stops at the last node
        return i; // return how many times the data showed up
    } // howManyNodes method





    //Mutators

    // returns the node found at a specific location in the list
    public Node nodeAt(int whichNode) {
        Node current = this.getHeadNode(); // starts at the first node
        // goes through each node until it gets the one the user wants
        for (int i = 0; i < whichNode - 1; i++)
            current = current.getNext(); // go to the next node
        return current; // return the node that the user asked for
    } // nodeAt method


    // traverses the list and removes every node that
    // contains a specific piece of data
    public void removeNodes(String data) {
        Node current = this.getHeadNode(); // starts at the first node
        // goes through each node in the list
        do {
            // check the data of the next node
            if (current.getNext().getData().equals(data))
                // if the next node has the data we're looking for,
                // set the pointer of this node to skip the one after
                current.setNext(current.getNext().getNext());
            current = current.getNext(); // move onto the next node
        } // do loop
        while (current.getNext() != null); // keep repeating until the last node
    } // removeNodes method


    //************************************************************************************************************
    //This class will build nodes for a linked list.

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

        public Node (String data, Node next)
        {
            this.data = data;
            this.next = next;
        } //Constructor 2 - client can specify the data


        // and which node this node points to

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
            String data1, data2;
            data1 = "Node [" + this.data + "] points to:";

            //Check if node is the tail node
            if (this.next == null)
            {
                data2 = " null.";
            }
            else
            {
                //Retrieve the data component of the next
                //node that current node is pointing at
                data2 = this.next.getData ();
            } //end if

            return data1 + data2;

        }
    } //Node class
}

