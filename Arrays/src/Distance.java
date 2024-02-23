//Calculate Distance Between Two Points
//Sqrt((y2-y1)^2 +(X2-X1)^2)

public class Distance {
    public static void main(String[] args) {
        int y1 = 10;
        int y2 = 20;
        int x1 = 30;
        int x2 = 50;

        calDistance(y1,y2,x1,x2);
    }

    private static void calDistance(int y1, int y2, int x1, int x2) {
        double d = Math.sqrt(Math.pow((y2-y1),2) + Math.pow((x2-x1),2));

        System.out.println(d);

    }
}
