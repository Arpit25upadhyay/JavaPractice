public class HalfString {
    public static void main(String[] args) {

    }
    public boolean halvesAreAlike(String s) {
        int len = s.length();

        String firstHalf = s.substring(0, len/2).toLowerCase();
        String secondHalf = s.substring(len/2, s.length()).toLowerCase();

        int count1 = 0;
        int count2 = 0;
        for(int i  = 0; i< firstHalf.length(); i++){
            if(isVowel(firstHalf.charAt(i))){
                count1++;
            }
        }

        for(int i  = 0; i< secondHalf.length(); i++){
            if(isVowel(secondHalf.charAt(i))){
                count2++;
            }
        }

        return count1 == count2;
    }

    public boolean isVowel(char ch){
        char X = ch;
        return (X == 'a' || X == 'e' || X == 'i' || X == 'o' || X == 'u' );
    }
}
