public class MyPriorityDemo {
    private int[] array;
    private int size;

    public void add(int element){
        array[size++] = element;
        //向上调整
    }

    public int pop(){
        int e = array[0];
        array[0] = array[array.length - 1];
        Practice.headpify(array,array.length - 1,0);
        return e;
    }
    public int peek(){
        return array[0];
    }

    /**
     *log(n)
     * @param array 要调整的数组
     * @param index 要调整的下标
     */
    private static void adjustUp(int[] array,int index){
        while(index > 0) {
            int parent = (index - 1) / 2;
            if (array[index] < array[parent]) {
                return;
            }
            swap(array, index, parent);
            index = parent;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
