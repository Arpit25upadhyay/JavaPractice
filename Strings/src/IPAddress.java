public class IPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder op = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            if(address.charAt(i) == '.'){
                op.append("["+ address.charAt(i) + "]");
            }else{
                op.append(address.charAt(i));
            }
        }
        return op.toString();
    }
}
