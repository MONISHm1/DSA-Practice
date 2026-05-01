import java.util.*;
public class minCoinRequired {
    public static void main(String[] args) {
        int coin[] = {2000,1,5,2,10,50,20,100,500};
        Arrays.sort(coin);
        int count = 0;
        int amount = 590;
        ArrayList<Integer> usedCoin = new ArrayList<>();
        for(int i = coin.length-1;i>=0; i--){
            while (amount >= coin[i]) {
                usedCoin.add(coin[i]);
                amount -= coin[i];
                count++;
            }
        }
        System.out.println(usedCoin);
        System.out.println(count);
    }
}
