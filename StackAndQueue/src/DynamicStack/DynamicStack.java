package DynamicStack;

import Custom.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super(); //it will call CustomStack() constructor
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(int size) constructor
    }

    public boolean isFull(){
        return this.ptr == this.data.length -1;
    }

    public boolean isEmpty(){
        return this.ptr == -1;
    }

    @java.lang.Override
    public void push(int item) {
        if(isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        super.push(item);
    }


}
