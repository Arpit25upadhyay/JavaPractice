public class NumberOfWaysToSplitAString {
    public static void main(String[] args) {
        String s1 = "10101";
        String s2 = "1001";
        String s3 = "0000";
        String s4 = "100010001";


        System.out.println(splitCount(s4));
    }

    private static int splitCount(String str) {
        long MOD = 100000007;

        int oneCount = 0;
        int n = str.length();

        for(char c : str.toCharArray()){
            if(c == '1'){
                oneCount++;
            }
        }

        if(oneCount%3 != 0){
            return 0;
        }

        if(oneCount == 0){
            return (int)((long)((n-2)*(n-1)/2)%MOD);
        }

        int oneThird = oneCount/3;
        int twoThird = 2*oneThird;
        int oneWay = 0;
        int secondWay = 0;
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == '1'){
                count++;
            }
            if(count == oneThird){
                oneWay++;
            }
            if(count == twoThird){
                secondWay++;
            }
        }
        return   (int)((long)(oneWay*secondWay)%MOD);
    }
}
