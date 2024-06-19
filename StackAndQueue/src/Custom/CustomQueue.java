package Custom;

import java.util.Arrays;
public class CustomQueue  {
    private int[] data;
    //static : bcoz it is going to be same for all the object of CustomQueue
    private static final int DEFAULT_SIZE = 10;
    public int end = 0;

    public CustomQueue(){
        //calling another constructor
        this(DEFAULT_SIZE); //= CustomQueue(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == this.data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()) return false;

        data[end++] = item;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int removed = data[0];
        for(int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "->");
        }
        System.out.println("end");
    }

}
