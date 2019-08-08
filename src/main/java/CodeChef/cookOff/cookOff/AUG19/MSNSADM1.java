package CodeChef.cookOff.cookOff.AUG19;

import java.util.Arrays;
import java.util.Scanner;


/***
 * @Link : https://www.codechef.com/AUG19B/problems/MSNSADM1
 *
 * @Problem : Given score and penatly want to print the maximum score
 *
 * @InputFormat
 * testcases
 *  number of playes
 *      array of the integers
 *      array of paneltiyes
 *
 * @OuputFormat
 * single value to maximum number
 *
 * @SampleInput
 * 2
 * 3
 * 40 30 50
 * 2 4 20
 * 1
 * 0
 * 10
 *
 * @SampleOutput
 * 800
 * 0
 *
 * @ideas
 *
 */
public class MSNSADM1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {

            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = Math.max(0, 20*a[i] - 10*b[i]);
            }

            System.out.println(Arrays.stream(c).max().getAsInt());
        }
    }
}
