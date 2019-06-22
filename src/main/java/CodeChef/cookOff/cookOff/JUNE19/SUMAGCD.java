package CodeChef.cookOff.cookOff.JUNE19;

import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/JUNE19B/problems/SUMAGCD
 *
 * @Problem : Given a list of number divided them into two group such that each group have it's highest number
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @Sample
 *
 * @ideas
 * > Gcd will be high when the set contains are relatvie prime with each other
 * > we can use that one [possible all relative prime ] another [there substring]
 * > sorry this is gcd so it si other way around gcd will be hight when the all are really close in one set
 * > So make two sets in such way that both are really close
 * > the gcd will the max of the number present in the array
 *
 * Greedy
 * that the highest and choose it child in one set.[second one can also win with this]
 *
 * status : Done
 */
public class SUMAGCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int firstMax = 0;
            int secondMax =0;
            int firstMaxIndex = -1;
            int secondMaxIndex = -1;

            for (int i = 0; i < n; i++) {
                int ele = a[i];
                if(ele > firstMax){
                    firstMax = ele;
                    firstMaxIndex = i;
                }
                if(ele > secondMax && ele != firstMax){
                    secondMax = ele ;
                    secondMaxIndex = i;
                }
            }
            System.out.println(Math.max(firstMax + gcdArray(a,firstMaxIndex),secondMax + gcdArray(a,secondMaxIndex)));

        }
    }

    private static int gcdArray(int[] a, int ignoreIndex) {
        int finalGcd = 0 != ignoreIndex ? a[0] :a[1];
        for (int i = 0; i < a.length; i++) {
            finalGcd = i != ignoreIndex ? gcd(finalGcd,a[i]) :finalGcd;
        }
        return finalGcd;
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
}
