package Strings;

public class StringTOint {
    public static void main(String[] args) {
        String s = "9223372036854775808";
        int ans = strToNumber(s.trim());
        System.out.println(ans);
    }

    public static int strToNumber(String s){
        boolean neg = false;
        long ans = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i == 0){
                if(ch == '-'){
                    neg = true;
                    continue;
                }else if(ch == '+'){
                    neg = false;
                    continue;
                }
            }

            if(ch >= '0' && ch <= '9'){
                int dig = ch - '0';
                ans = ans*10 + dig;
                if(neg){
                    long negNum = -ans;
                    if(negNum < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }else {
                    if(ans > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }
            }else{
                break;
            }
        }

        if(neg){
            return (int) -ans;
        }else{
            return (int) ans;
        }
    }
}
