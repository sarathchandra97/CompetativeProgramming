package CodeChef.cookOff.cookOff.JULY19;


import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/JULY19B/problems/CHFM
 *
 * @Problem : Steal a coin without changing mean
 *
 * @InputFormat
 *  number of testcase
 *      number of Coin
 *      Coin
 * @OuputFormat
 *
 * @Sample
 *
 * 3
 * 5
 * 1 2 3 4 5
 * 4
 * 5 4 3 6
 * 10
 * 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000
 *
 * 3
 * Impossible
 * 1
 *
 * @ideas
 * mean = sum/n = sum-x/n-1
 *
 */
public class CHFM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();

            Coin[] coins = new Coin[n];
            for (int i = 0; i < n; i++) {
                coins[i] = new Coin(i+1, scan.nextDouble());
            }

            Arrays.sort(coins);
            //System.out.println(Arrays.toString(coins));

            double sum = 0;
            for(Coin coin : coins){
                sum += coin.cost;
            }
            double mean  =  sum/n;
            Coin minCoin = null;
            for(Coin coin : coins){
                double newMean = (sum - coin.cost) / (n-1);
                if(newMean == mean){
                    minCoin = coin;
                    break;
                }

            }
            if(null == minCoin)
                System.out.println("Impossible");
            else
                System.out.println(minCoin.index);

        }
    }
    static class Coin implements Comparable{
        int index;
        double cost;

        public Coin(int index, double cost) {
            this.index = index;
            this.cost = cost;
        }

        public int compareTo(Object o) {
            Coin coin = (Coin)o;
            return Double.compare(this.cost,coin.cost);
        }

        @Override
        public String toString() {
            return "Coin{" +
                    "index=" + index +
                    ", cost=" + cost +
                    "}/n";
        }
    }
}
