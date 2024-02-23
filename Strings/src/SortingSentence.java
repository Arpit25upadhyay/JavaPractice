public class SortingSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {

        String[] wordArray = s.split(" ");

        String[] orderArray = new String[wordArray.length];



        for (int i = 0 ; i< wordArray.length; i++){
            int l = wordArray[i].length() -1;
            int a = Character.getNumericValue(wordArray[i].charAt(l));
            orderArray[a-1] = removeLastChar(wordArray[i]);
            orderArray[a-1] = wordArray[i].substring(0, wordArray[i].length()-1);
        }


        return  String.join(" ",orderArray).trim();

    }


    public static String removeLastChar(String s){
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i< s.length()-1; i++){
            str.append(s.charAt(i));
        }
        return  str.toString();
    }
}
