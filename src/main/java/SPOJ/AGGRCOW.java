package SPOJ;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.spoj.com/problems/AGGRCOW/
 *
 * @Problem : given array and stalls you have to array in such a way that
 * maximum minimum distance between the two cows
 * largest minimum distance.
 * minimize the max separation
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @SampleInput
 *
 * 1
 * 5 3
 * 1
 * 2
 * 8
 * 4
 * 9
 *
 * @SampleOutput
 * 3
 *
 * @ideas
 * How to distribute it
 * the 1st cow will be first
 * last cow will be in the last
 *
 * how to distribute it is evenly
 *
 *
 * *****Monotonic functions**** : you can
 * Given the space can you tell
 *
 *
 * @RelatedQuestion
 * How to distribute the tower so all the houses are covered
 * How to distribute the builder evenly with the edges
 *
 */
public class AGGRCOW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int c = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            // !!! Important thing is here binary search is on the
            int minval = 1;
            int li = 1, hi = a[n-1]-a[0];
            while(li<=hi){
                int m = (li + hi )/ 2;
                if(canAdjust(a,m,c)){
                    li = m+1;
                    minval = m;
                }
                else
                    hi = m-1;
            }
            System.out.println(minval);
        }
    }

    private static boolean canAdjust(int[] a, int m, int c) {
        c--;
        int preposition = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]-preposition >= m){
                c--;
                preposition = a[i];
            }
        }
        return c<=0;
    }
}
