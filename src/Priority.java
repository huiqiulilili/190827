import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random(190827);

        Queue<Integer> queue1 = new LinkedList<>();
        for(int i = 0;i < 10;i ++){
            int n = random.nextInt(100);
            queue.add(n);
            queue1.add(n);
        }
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("==================");
        while(!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

    }
}
