public class Merging {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();
        int x = l1>l2 ? l1 : l2;
        while(i < l1 || j < l2){
            if(i<l1){
                s.append(word1.charAt(i));
                i++;
            }
            if(j<l2){
                s.append(word2.charAt(j));
                j++;
            }
        }
        return s.toString();
    }
}
