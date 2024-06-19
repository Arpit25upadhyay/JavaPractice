import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnangramII {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        for(List<String> ans : groupAnagram(strs)){
            System.out.println(ans);
        }
    }

    public static List<List<String>> groupAnagram(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> wordMap = new HashMap<>();

        for(String word : strs){
            String newWord =  createWords(word);
            if(wordMap.containsKey(newWord)){
                wordMap.get(newWord).add(word);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(word);
                wordMap.put(newWord, temp);
            }
        }

        for(Map.Entry<String, List<String>> map : wordMap.entrySet()){
            ans.add(map.getValue());
        }
        return ans;
    }


    public static String createWords(String s){
        int[] freq = new int[26];

        for(char c :  s.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder newWord = new StringBuilder();

        for(int i = 0; i<26; i++){
            int f = freq[i];
            if(f > 0){
                for(int j =0; j<f; j++){
                    newWord.append('a' + i);
                }
            }
        }
        return newWord.toString();
    }
}
