public class MyDemo {
    private int[] array;
    private int size;

    public void add(int element){
        array[size++] = element;
        Practice3.heapUp(array,size);
    }
    public int pop(){
        int e = array[0];
        array[0] = array[--size];
        Practice3.headpity2(array,size,0);
        return e;
    }

    public int peek(){
        return array[0];
    }
}
