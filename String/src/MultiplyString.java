public class MultiplyString {
    public static void main(String[] args) {
        String a = "123";
        String b = "456";

        System.out.println(multiply(a,b));
    }

    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int l1 = num1.length();
        int l2 = num2.length();

        int[] res = new int[l1+l2];

        int carry = 0;

        int kPos = 0;
        for(int i = l2-1; i>=0; i--){
            int k = res.length - 1 - kPos;
            int j  = l1-1;
            while(j>=0 || carry !=0){
                int iVal = num2.charAt(i) - '0';
                int jVal = j >= 0? num1.charAt(j) - '0' : 0;
                int prod = iVal * jVal + carry + res[k];
                res[k--] = prod%10;
                carry = prod/10;
                j--;

            }
            kPos++;
        }


        boolean nonZero = false;
        int idx = 0;
        String ans = "";

        for(int n : res){
            if(n == 0 && !nonZero){
                continue;
            }else{
                nonZero = true;
                ans += n;
            }
        }
        return ans;
    }
}
