package Custom;

public class CustomStack {
    protected int[] data;
    //static : bcoz it is going to be same for all the object of CustomStack
    private static final int DEFAULT_SIZE = 10;
    public int ptr = -1;
    public CustomStack(){
        //calling another constructor
        this(DEFAULT_SIZE); //= CustomStack(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item){
        if (ptr == data.length-1) {
            System.out.println("Data is full");
            return;
        }
        ptr++;
        data[ptr] = item;
    }

    public int getSize(){
        return ptr+1;
    }

    public int pop(){
        if(ptr == -1){
            System.out.println("Data is empty");
            return -1;
        }
//        int ans = data[ptr];
//        ptr--;
        return data[ptr--];
    }
}
