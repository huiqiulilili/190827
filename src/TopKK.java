import java.util.Arrays;
import java.util.Random;

public class TopKK {
    public static void main(String[] args) {
        int[] wuli = new int[100];
        Random random = new Random(20190827);

        for(int i = 0;i < 100;i ++){
            int n = random.nextInt(1000);
            wuli[i] = n;
        }

        int[] topK = find(wuli,5);
        System.out.println(Arrays.toString(topK));
        System.out.println("===============");
        System.out.println(Arrays.toString(Arrays.copyOfRange(wuli,wuli.length - 10,wuli.length)));
    }
    public static int[] find(int[] array,int k){
        int[] heap = new int[k];
        for(int i = 0;i < k;i ++){
            heap[i] = array[i];
        }
        creatHeapMin(heap,heap.length);
        for(int i = k;i < array.length;i ++){
            if(array[i] > heap[0]){
                heap[0] = array[i];
                heapMin(heap,heap.length,0);
            }
        }
        return heap;
    }
    public static void creatHeapMin(int[] array,int size){
        for(int i = (size - 2) / 2;i >= 0;i --){
            heapMin(array,size,0);
        }
    }
    public static void heapMin(int[] array,int size,int index){
        while(true) {
            int left = index * 2 + 1;
            if (left >= size) {
                return;
            }
            int min = left;
            if (left + 1 < size && array[left + 1] < array[left]) {
                min = left + 1;
            }
            if (array[min] < array[index]) {
                swap(array, index, min);
            }
            index = min;
        }
    }
    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}

