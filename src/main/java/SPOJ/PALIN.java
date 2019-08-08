package SPOJ;

import java.util.Scanner;

/***
 * @Link : https://www.spoj.com/problems/PALIN/
 *
 * @Problem :
 *
 * @InputFormat
 * testcases
 *  number of the palindrome
 * @OuputFormat
 *
 * @SampleInput
 * 2
 * 808
 * 2133
 *
 * @SampleOutput
 * 818
 * 2222
 *
 * @ideas
 *
 */
public class PALIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = (int) (s.charAt(i - 1)) - 48;

            }

            if(isAtleast(a)){
                clearAll(a);
                a[0] = a[a.length - 1] = 1;
                continue;
            }

            for (int i = 1; i < n/2; i++) {

            }



        }

    }

    private static void clearAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    private static boolean isAtleast(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if(a[i] != 9)
                return false;
        }
        return true;
    }
}
