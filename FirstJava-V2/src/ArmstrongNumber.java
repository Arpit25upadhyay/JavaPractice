//To find Armstrong Number between two given number.

//356 = 3^3 +5^3 +6^3
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 123;
        int m = 1000;

        for(int i = n; i <= m; i++){
            int noOfdigit = 0;
            int sum = 0;
            int temp = i;
            int temp2 = i;
            //to find number of digit
            while(temp !=0){
                temp = temp/10;
                noOfdigit++;
            }
            //find armstrong calculation
            while(temp2 != 0){
                int digit = temp2%10;
                temp2 = temp2/10;
                sum += (int)Math.pow(digit,noOfdigit);
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
