public class FindUniqueII {
    public static void main(String[] args) {

        int[] arr = {2,2,3,2,7,7,8,7,8,8};

        int sum = 0;
        for(int n : arr){
            sum += Integer.parseInt(Integer.toBinaryString(n));
        }


        System.out.println(convertDecimal(sum%3));

    }

    private static int convertDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    private static int convertBinary(int n) {
        int i = 0;
        while(n!=0){
            int k = n%2;
            i = i*10 +k;
            n= n/2;
        }
        return  i;
    }
}
