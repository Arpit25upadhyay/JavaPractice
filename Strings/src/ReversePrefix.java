public class ReversePrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
    public static String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        StringBuilder str =  new StringBuilder();
        int j = i+1;

        while(i>=0){
            str.append(word.charAt(i));
            i--;
        }

        while(j< word.length()){
            str.append(word.charAt(j));
            j++;
        }

        return str.toString();
    }
}
