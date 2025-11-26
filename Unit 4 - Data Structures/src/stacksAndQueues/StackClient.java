package stacksAndQueues;

// The "StackClient" class.
public class StackClient
{
    public static void main (String[] args)
    {
        Stack stack1 = new Stack ();
        Stack stack2 = new Stack();

        stack2.push(1);



        stack1.push(17);
        stack1.push(0);
        stack1.push(100);
        stack1.push(25);
        stack1.push(43);
        stack1.push(8);


        System.out.println("This stack has " + stack1.size() + " items. \n");
        System.out.println("The top item in this stack is: " + stack1.viewTop() + ". \n");
        System.out.println (stack1);
        int itemPopped = stack1.pop ();
        System.out.println ("Item popped: " + itemPopped);
    } // main method
} // StackClient class
