package CodeChef.cookOff.cookOff.AUG19;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/AUG19B/problems/ZOMCAV
 *
 * @Problem :
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @SampleInput
 *
 * @SampleOutput
 *
 * @ideas
 *
 */
public class ZOMCAV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                int ele = scan.nextInt();
                c[Math.max(0,i-ele)]++;
                if(i+ele+1 > n-1)
                    continue;
                c[i+ele+1]--;
            }
            int h[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scan.nextInt();
            }
            int r[] = new int[n];
            r[0] = c[0];
            for (int i = 1; i < n; i++) {
                r[i] = r[i-1]+c[i];
            }
            Arrays.sort(h);
            Arrays.sort(r);
            boolean isEqual = true;
            for (int i = 0; i < n; i++) {
                if(r[i] != h[i]){
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
