public class MaxRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        while(sequence.contains(sb.toString())){
            sb.append(word);
            count++;
        }
        return count;
    }

}
