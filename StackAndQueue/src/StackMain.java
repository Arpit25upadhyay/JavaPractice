import DynamicStack.DynamicStack;

public class StackMain {
    public static void main(String[] args) {
//        CustomStack cusStack = new CustomStack(5);
//        cusStack.push(3);
//        cusStack.push(5);
//        cusStack.push(4);
//        cusStack.push(7);
//        cusStack.push(1);
//        System.out.println(cusStack.getSize());
//        System.out.println(cusStack.pop());
//        System.out.println(cusStack.getSize());

        DynamicStack dStack = new DynamicStack(3);
        dStack.push(1);
        dStack.push(3);
        dStack.push(2);

        System.out.println(dStack.getSize());

        dStack.push(5);

        System.out.println(dStack.getSize());



    }
}
