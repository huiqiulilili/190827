import java.util.PriorityQueue;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random(21019219);
        for(int i = 0;i < 10;i ++){
            queue.add(random.nextInt(1000));
        }
        System.out.println(queue);
    }
}
