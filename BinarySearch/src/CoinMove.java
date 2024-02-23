public class CoinMove {
    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[] {2,3,3}));
    }
    public static int minCostToMoveChips(int[] position) {
        int evenCost = 0;
        int oddCost = 0;
        for(int i = 0; i< position.length; i++){
            if(position[i] % 2 == 0){
                evenCost++;
            }else{
                oddCost++;
            }
        }
        return oddCost > evenCost? evenCost: oddCost;
    }
}
