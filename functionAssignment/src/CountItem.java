import java.util.ArrayList;
import java.util.List;

public class CountItem {
    public static void main(String[] args) {
        int count = 0;
        int idx=0;
        String ruleKey = "color";
        String ruleValue = "silver";

         switch(ruleKey){
             case "type":
             idx = 0;
             break;
             case "color":
             idx = 1;
             break;
             case "name":
             idx = 2;
             break;
             default:
                 throw new IllegalStateException("Unexpected value: " + ruleKey);
         }

        List<List<String>> p = new ArrayList<>();
        List<String> l = new ArrayList<>();
        List<String> m = new ArrayList<>();
        List<String> n = new ArrayList<>();

        l.add("phone");
        l.add("blue");
        l.add("pixel");

        m.add("computer");
        m.add("silver");
        m.add("lenovo");

        n.add("phone");
        n.add("gold");
        n.add("iphone");

        p.add(l);
        p.add(m);
        p.add(n);

        //System.out.println(l);
        System.out.println(p);

        for(List list : p){
            if(list.get(idx) == ruleValue){
                System.out.println(list.get(idx));
                count++;
            }
        }
        System.out.println(count);
    }

}

