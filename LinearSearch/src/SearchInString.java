public class SearchInString {
    public static void main(String[] args) {
        String name = "Arpit";
        System.out.println(searchChar(name, 'i'));
    }
    static boolean searchChar(String str, char target){
        if(str.length() == 0){
            return false;
        }
//        for (int i = 0; i< str.length(); i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }

        for(char c : str.toCharArray()){
            if (c ==target) {
                return true;
            }
        }

        return false;
    }
}
