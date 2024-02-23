public class Pragram {
    public static void main(String[] args) {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        if (sentence.length() < 26) {
            System.out.println(false);
        } else {
            System.out.println(isPangram(sentence));
        }
    }
    public static boolean isPangram(String s){
        Boolean[] allAlpha = new Boolean[26];
        int index =0;
        for(int i = 0; i<s.length();i++){
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
//                index = s.charAt(i) - 'a';
                allAlpha[s.charAt(i) - 'a'] = true;
            }
//            allAlpha[index] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (allAlpha[i] == null || allAlpha[i] == false){
                return (false);
            }

        return (true);

    }
}

