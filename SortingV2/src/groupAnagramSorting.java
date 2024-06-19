import java.util.*;

public class groupAnagramSorting {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //
        for(List l : groupAnagrams(strs)){
            System.out.print(l);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            String sortedS = sortString(s);
            if(map.containsKey(sortedS)){
                map.get(sortedS).add(s);
            }else{
                List<String> col = new ArrayList<>();
                col.add(s);
                map.put(sortedS, col);
            }
        }

        for(Map.Entry<String, List<String>> m : map.entrySet()){
            ans.add(m.getValue());
        }

        return ans;

    }

    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
