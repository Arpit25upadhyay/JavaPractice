import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        for(List<String> l :  groupAnagramUsingSort(str)){
            System.out.println(l);
        }

        for(List<String> l :  groupAnagramWithoutSort(str)){
            System.out.println(l);
        }
    }

    private static List<List<String>> groupAnagramWithoutSort(String[] str) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> wordMap = new HashMap<>();
        for(String s : str){
            String newWord = freqCreate(s);

            if(wordMap.containsKey(newWord)){
                wordMap.get(newWord).add(s);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                wordMap.put(newWord,temp);
            }
        }

        for(Map.Entry<String, List<String>> mapObject : wordMap.entrySet()){
            res.add(mapObject.getValue());
        }
        return res;
    }

    private static String freqCreate(String s) {
        int[] charFreq = new int[26];

        for(char c : s.toCharArray()){
            charFreq[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<charFreq.length; i++){
            int freq = charFreq[i];
            if(freq > 0){
                for(int j = 0; j<freq; j++){
                    sb.append(i+'a');
                }
            }
        }
        return sb.toString();
    }

    private static List<List<String>> groupAnagramUsingSort(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> sortMap = new HashMap<>();
        for(String s : str){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            String sortedString = new String(cArr);
            if (!sortMap.containsKey(sortedString)){
                List<String> temp = new ArrayList<>();
                temp.add(s);
                sortMap.put(sortedString,temp);
            }else{
                sortMap.get(sortedString).add(s);
            }
        }

        for(Map.Entry<String, List<String>> entry : sortMap.entrySet()){
            ans.add(entry.getValue());
        }


        return  ans;
    }

}
