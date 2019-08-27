public class Practice {
    /**
     *
     * @param array  被看成堆的数组
     * @param size   数组中被看成堆的个数
     * @param index  要调整的位置
     */
    public static void headpify(int[] array,int size,int index ){
        while(true) {
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
    public static void createHeap(int[] array,int size){
        for(int i = (size - 2)/2;i >= 0;i --){
            headpify(array,size,i);
        }
    }

    //向上调整 log(n)
    public static void adjustUp(int[] array,int index){
        while(true) {
            if (index == 0) {
                return;
            }
            int parent = (index - 1) / 2;
            if (array[parent] > array[index]) {
                return;
            }
            swap(array, index, parent);
            index = parent;
        }
    }

}
