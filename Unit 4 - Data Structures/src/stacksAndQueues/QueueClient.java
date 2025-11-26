package stacksAndQueues;

public class QueueClient {

    public static void main(String[] args) {

        Queue queue1 = new Queue();


        for (int i = 1; i < 2; i++) {
            queue1.enqueue(i);
        }

        System.out.println(queue1);
        System.out.println("rear: " + queue1.viewLast());
        System.out.println("front: " + queue1.viewFirst());
        //System.out.println(queue1.viewFront());
        System.out.println();
        System.out.println("Dequeued: " + queue1.dequeue());
        System.out.println();
        // System.out.println("Dequeued: " + queue1.dequeue());

        System.out.println(queue1);
        //System.out.println("Dequeued: " + queue1.dequeue());

    }

}
