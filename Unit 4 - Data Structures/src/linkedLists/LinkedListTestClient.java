package linkedLists;

import java.util.Scanner;

public class LinkedListTestClient {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        // create a linked list with 20 random integers
        // between 50 and 60 as Strings
        LinkedList list = new LinkedList();
        for (int i = 0; i < 20; i++)
            list.addNodeOnEnd(Integer.toString(
                    (int) (Math.random() * (60 - 50 + 1)) + 50));
        System.out.println(list);

        // print how many times the number 50 is in the linked list
        System.out.println(list.howManyNodes("50"));
        // remove all nodes with the number
        list.removeNodes("50");
        // print the list with the removed nodes
        System.out.println();
        System.out.println(list);
        // print the 7th node
        System.out.println("The 7th node is: \n" + list.nodeAt(7));

        // ask the user for a number between 50 and 60
        // display how often the data appears in the linked list
        System.out.print("Enter a number between 50 and 60: ");
        String data = sc.next();
        System.out.println("The number " + data + " appears " + list.howManyNodes(data) + " times.");

        // print how many nodes are in the linked list
        int sum = 0;
        for (int i = 50; i < 61; i++)
            sum = sum + list.howManyNodes(String.valueOf(i));
        System.out.println("There are " + sum + " nodes in the linked list. \n");

        // ask the user for a number between 50 and 60
        // remove all nodes with that number
        System.out.print("Enter another number between 50 and 60: ");
        data = sc.next();
        list.removeNodes(data);
        System.out.println(list); // print the updated list

    }

}
