public class MyPriority {
    int[] array = new int[100];
    int size = 0;

    public void add(int element){
        array[size++] = element;
        Practice.adjustUp(array,size - 1);
    }

    public int peek(){
        return array[0];
    }

    public int pop(){
        int e = array[0];
        array[0] = array[--size];
        Practice.headpify(array,size,0);
        return e;
    }
}
