package stacksAndQueues;

/*
QueueClient
test that the methods of the Queue class work
Carlos Matos
Monday, December 1, 2025
 */

public class QueueClient {

    public static void main(String[] args) {

        // create an empty queue
        Queue queue1 = new Queue();

        // fill the queue with the numbers from 1 to 10
        for (int i = 0; i < 10; i++) {
            // i + 1 because i is 0
            queue1.enqueue(String.valueOf(i + 1));
        }

        System.out.println(queue1 + "\n"); // print the queue
        // print the front and rear of the queue
        System.out.println("Front: " + queue1.viewFront());
        System.out.println("Rear: " + queue1.viewRear() + "\n");
        // print the size of the queue
        System.out.println("There are " + queue1.size() + " items in the queue \n");
        // dequeue the front item
        System.out.println("Dequeued: " + queue1.dequeue());
        // print the new size of the queue
        System.out.println("There are now " + queue1.size() + " items in the queue \n");

        // empty the queue
        while (queue1.isEmpty() == false) {
            queue1.dequeue();
        }
        System.out.println("*emptied the queue*");

        // print whether the queue is empty or not
        System.out.println("Is the queue empty? (" + queue1.isEmpty() + ")");


    }

}
