public class DecryptAlphabate {
    public static void main(String[] args) {
        System.out.println(701%26);
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        //String[] arr = s.split("#");
        StringBuilder op = new StringBuilder();

        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i) != '#' ){
                op.append((char)(96 + Character.getNumericValue(s.charAt(i))));
                i--;
            }else{
                op.append((char)(96+ (Character.getNumericValue(s.charAt(i-2))*10) + Character.getNumericValue(s.charAt(i-1))));
                i= i-3;
            }
        }

        return op.reverse().toString();
    }
}

