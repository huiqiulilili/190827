import java.util.Arrays;

public class Practice2 {
    //向下调整   堆化

    /**
     *
     * @param array   被看成堆的数组
     * @param size    数组中被看成堆的个数
     * @param index   要调整的下标
     */
    public static void heapify(int[] array,int size,int index){
        while (true) {
            int left = 2 * index + 1;
            if (left >= size) {
                return;
            }
            int max = left;
            if (left + 1 < size && array[left + 1] > array[left]) {
                max = left + 1;
            }
            if (array[max] > array[index]) {
                swap(array, index, max);
            }
            index = max;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


    //建堆，将数组转换成堆
    public static void createdHeap(int[] array,int size){
        int parent = (size - 2) / 2;
        for(int i = parent;i >= 0;i --){
            heapify(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,3,5,2,1,3,1};
        heapify(array,7,0);
        System.out.println(Arrays.toString(array));
    }
}
