package CodeChef.cookOff.cookOff.MIsc;

import java.util.Scanner;

/***
 *
 * @Link : https://www.codechef.com/MARCH18B/problems/BIGSALE
 *
 * @Problem : How much loss will he make if he made price x% increase and then discount x% given the final price
 * and the discount pricee
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @Sample
 *
 * @ideas Find the original prices and subtract it
 *
 * original * x  = final
 * discount =
 * Twist we don't have original prices or the value of discount perecent
 */
public class BIGSALE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            float final_price[] = new float[n];
            for (int i = 0; i < n; i++) {
                final_price[i] = scan.nextFloat();
            }
            float discount_price[] = new float[n];
            for (int i = 0; i < n; i++) {
                discount_price[i] = scan.nextInt();
            }


        }
    }
}
