public class MatchString {
    public static void main(String[] args) {
        String s1 = "My name is Arpit";
        String s2 = "My Arpit";
        System.out.println(areSentencesSimilar(s1,s2));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        //return words1.length <= words2.length ? checkSimilarity(words2, words1) : checkSimilarity(words1, words2);
        return words1.length >= words2.length ? similarSentences(words1, words2) : similarSentences(words2, words1);
    }

    public static boolean similarSentences(String[] bigSentence, String[] smallSentence){
        int i1 = 0;
        int i2 = 0;
        int j1 = bigSentence.length - 1;
        int j2 = smallSentence.length - 1;

        while(i2<=j2){
            //checking if it matches from begining
            if(bigSentence[i1].equals(smallSentence[i2])){
                i1++;
                i2++;
            }
            //matching from end
            else if(bigSentence[j1].equals(smallSentence[j2])){
                j1--;
                j2--;
            }else{
                //kuch match nhi hua
                return false;
            }
        }
        return true;
    }

    public static boolean checkSimilarity(String[] words1, String[] words2){
        int bigLen = words1.length;
        int shortLen = words2.length;

        int matchCount = 0;
        int i = 0;

        //Checking form begining
        while(i<shortLen){
            if(words2[i].equals(words1[i])){
                matchCount++;
                i++;
            }else{
                break;
            }
        }

        //checking from end
        while(i<shortLen){
            if(words2[i].equals(words1[i+(bigLen - shortLen)])){
                i++;
                matchCount++;
            }else{
                break;
            }
        }

        return matchCount == shortLen;

    }
}
