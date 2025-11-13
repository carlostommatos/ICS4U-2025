package linkedLists;

import java.util.Scanner;

public class LinkedListTestClient {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        for (int i = 0; i < 20; i++)
            list.addNodeOnEnd(Integer.toString((int) (Math.random() * (60 - 50 + 1)) + 50));



        System.out.println(list);
        System.out.println(list.howManyNodes("1"));
        System.out.println(list.nodeAt(7));
        list.removeNodes("1");

        System.out.println();
        System.out.println(list);

        System.out.println("The 7th node is: \n" + list.nodeAt(7));
        System.out.print("Enter a number between 50 and 60: ");
        String data = sc.next();
        System.out.println(data);
        System.out.println("The number " + data + " appears " + list.howManyNodes(data) + " times.");

        


    }

}
