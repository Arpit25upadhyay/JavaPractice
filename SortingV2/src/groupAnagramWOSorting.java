import java.util.*;

public class groupAnagramWOSorting {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        for(List<String> l : groupAnagram(s)){
            System.out.print(l + ", ");
        }

    }
    public static List<List<String>> groupAnagram (String [] arr){
        HashMap<String , List<String>> wordMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String w : arr){
            String newWord = generateWord(w);
            if(wordMap.containsKey(newWord)){
                wordMap.get(newWord).add(w);
            }else {
                List<String> l = new ArrayList<>();
                l.add(w);
                wordMap.put(newWord, l);
            }
        }

        for (Map.Entry<String, List<String>> m : wordMap.entrySet()){
            res.add(m.getValue());
        }

        return res;
    }

    private static String generateWord(String w) {
        int[] chArr = new int[26];
        for (char c : w.toCharArray()) {
            chArr[c - 'a']++;
        }

        StringBuilder newWordBuilder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int freq = chArr[i];
            if (freq > 0) {
                char character = (char) (i + 'a');
                for (int j = 0; j < freq; j++) {
                    newWordBuilder.append(character);
                }
            }
        }

        return newWordBuilder.toString();
    }

}
