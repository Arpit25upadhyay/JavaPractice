public class SubstringOnes {
    public static void main(String[] args) {
        System.out.println(numSub("0110111"));
    }
    public static int numSub(String s) {
        long mod = 1000000007;
        int l = s.length();
        long ans = 0;
        long count = 0;
        for(char c : s.toCharArray()){
            if(c != '0'){
                count++;
            }
            else{
                if(count != 0){
                    ans += (count * (count+1))/2;
                    count = 0;
                }
            }
        }


        ans += (count * (count+1))/2;
        return (int)(ans%mod);
    }
}
