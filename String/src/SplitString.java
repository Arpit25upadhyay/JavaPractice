public class SplitString {
    public static void main(String[] args) {
        String s = "100100010100110";
        System.out.println(numWays(s));
    }
    public static int numWays(String s) {
        int ans = 0;
        long count = 0;
        long MOD = 1000000007;
        int way1 = 0;
        int way2 = 0;
        long n = s.length();

        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }

        if(count == 0){
            return fact((int)(n-1))/2;
        }
        if(count%3 != 0){
            return 0;
        }else{
            int oneCount = 0;
            way1 = 1;
            way2 = 1;
            for(char c : s.toCharArray()){
                if(c == '1') {
                    oneCount++;
                }
                if(oneCount == count/3){

                    if(c == '0'){
                        way1++;
                    }
                }if(oneCount == (2*count)/3){

                    if(c == '0'){
                        way2++;
                    }
                }
            }
            ans = (way1* way2);
        }
        return ans;
    }

    public static int fact(int n){
        if(n== 0){
            return 1;
        }
        if(n <=2){
            return n;
        }
        return n*fact(n-1);
    }
}
