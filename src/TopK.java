import java.util.Arrays;
import java.util.Random;

public class TopK {
    public static void main(String[] args) {
        int[] wuli = new int[1000];
        Random random = new Random();
        for(int i = 0;i < wuli.length;i ++){
            wuli[i] = random.nextInt(10000);
        }
        int[] hight = find(wuli,5);
        System.out.println(Arrays.toString(hight));
        System.out.println("==========================");
        System.out.println(Arrays.toString(Arrays.copyOfRange(wuli,wuli.length - 10,wuli.length)));

    }
    private static int[] find(int[] array,int k){
        int[] heap = new int[k];
        for(int i = 0;i < k;i ++){
            heap[i] = array[i];
        }
        Practice3.createdHeapMin(array,k);
        for(int i = k;i < array.length;i ++){
            if(array[i] > heap[0]){
                heap[0] = array[i];
                Practice3.headpity2(heap,k,0);
            }
        }
        return heap;
    }
}
