import java.util.HashMap;
import java.util.Map;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println(isLongPressedName(name,typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int l1 = name.length();
        int l2 = typed.length();
        int i = 0;
        int j = 0;

        if(l1>l2) return false;

        while(i<l1  && j<l2){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(i>0 && typed.charAt(j) == name.charAt(i-1)) {
                j++;
            }
            else{
                return false;
            }
        }
        while(j<l2){
            if(name.charAt(i-1) != typed.charAt(j)){
                return false;
            }j++;
        }

        return i < l1 ? false : true;

    }
}
