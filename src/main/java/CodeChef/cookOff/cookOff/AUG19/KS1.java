package CodeChef.cookOff.cookOff.AUG19;

import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/AUG19B/problems/KS1
 *
 * @Problem :
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @SampleInput
 * 1
 * 3
 * 5 2 7
 *
 * @SampleOutput
 *
 * @ideas
 * if two same numebers form that means there is something in between that cancelingo out
 *
 * Two same numbers means there is 1 such triplet ?
 * Map -> nc2 + .. + mc2 of all the resource
 * 1 1 1 1
 * 1 0 1 0
 *
 * 1 2 1 2
 * 1 3 2 3
 *
 * 1 2 2 1
 * 0 3 1 0
 *
 * 1 1 1 1
 *
 *
 * so theory if the same number is repetaed the then that mean those whole will be equal
 */
public class KS1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int xor[] = new int[n];
            for (int i = 1; i < n; i++) {
                xor[i] = 1;
            }

        }
    }
}
