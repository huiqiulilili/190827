import java.util.Arrays;

public class Practice3 {
    //（向下调整） 堆化
    //大堆

    /**
     * 向下调整    1.转换成大堆
     * 如果要调整的下标的位置是叶子结点，则调整结束
     *比较左位置的值大还是右位置的值大（是否有右）
     * 比较 比较大的位置max 与 index 位置的值谁大
     * 如果max位置的值大 则交换 max位置的值 与 index位置的值
     */
    public static void headpity(int[] array,int size,int index){
        while(true) {
            int left = (index * 2) + 1;
            //如果 index 的左下标为空 则，直接返回
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
    //向下调整（堆化）  转换成小堆
    public static void headpity2(int[] array,int size,int index){
        while (true){
            int left = index * 2 + 1;
            if (left >= size) {
                return;
            }
            int min = left;
            if (left + 1 < size && array[left + 1] < array[left]) {
                min = left + 1;
            }
            if (array[index] > array[min]) {
                swap(array, index, min);
            }
            index = min;
        }
    }

    //建堆  大堆
    public static void createdHeapMax(int[] array,int size){
        int parent = (size - 2) / 2;
        for(int i = parent;i >= 0;i --){
            headpity(array,size,i);
        }
    }
    //建堆  小堆
    public static void createdHeapMin(int[] array,int size){
        int parent = (size - 2) / 2;
        for(int i = parent;i >= 0;i--){
            headpity2(array,size,i);
        }
    }


    //交换的方法
    private static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    //向上调整 小
    public static void heapUp(int[] array,int index){
        while (true) {
            int parent = (index - 1) / 2;
            if (array[index] > array[parent]) {
                return;
            }
            swap(array, index, parent);
            index = parent;
        }
    }

    //主方法
    public static void main(String[] args) {
//        int[] array = new int[]{4,3,5,2,1,2,1};
//        headpity(array,7,0);
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[]{7,3,5,7,8,6,9};
//        headpity2(array,7,0);
//        System.out.println(Arrays.toString(array));
//        int[] array = new int[]{7,3,5,7,8,6,9};
////        createdHeapMax(array,7);
////        System.out.println(Arrays.toString(array));
//        createdHeapMin(array,7);
//        System.out.println(Arrays.toString(array));

    }
}
