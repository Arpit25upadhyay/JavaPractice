public class StringMultiplication {
    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "0";
        System.out.println(multiply(num1,num2));
    }

    public static String multiply(String s, String t){

        int[] ans = new int[s.length()+t.length()];

        int pf = 0;
        int carry = 0;
        for(int i = t.length()-1; i>=0; i--){
            int j = s.length()-1;
            int iVal = t.charAt(i) - '0';
            int k = ans.length - 1 - pf;
            while(j>=0 || carry != 0){
                int jVal = j>=0 ? s.charAt(j)-'0' : 0;
                int prod = iVal * jVal + carry + ans[k];
                ans[k--] = prod%10;
                carry = prod/10;
                j--;
            }
            pf++;
        }

        StringBuilder sb = new StringBuilder();
        boolean noEncounter = false;
//
//        for(int i = 0; i< ans.length; i++){
//            if(ans[i] == 0 && noEncounter == false){
//                continue;
//            }else{
//                noEncounter = true;
//                sb.append(ans[i]);
//            }
//        }


        String result = "";
        for(int val:ans){
            if(!(result.length()==0 && val==0)){
                result+=val;
            }
        }

        return (result.length()==0) ? "0" : result;

        //return sb.toString();
    }
}
