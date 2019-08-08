package CodeChef.cookOff.cookOff.AUG19;

import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/AUG19B/problems/DSTAPLS
 *
 * @Problem : Given two types of distribution you have have to say when they we will equal
 *
 * @InputFormat
 * The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
 * The first and only line of each test case contains two space-separated integers N and K.
 *
 * @OuputFormat
 * For each test case, print a single line containing the string "YES" if the final
 * distributions of apples can be different or "NO" if they will be the same (without quotes).
 *
 * @SampleInput
 * 3
 * 5 1
 * 4 2
 * 10 10
 *
 * @SampleOutput
 *
 * NO
 * NO
 * YES
 * @ideas
 *
 * P1 : takes n/k and distributes it
 * P2 : takes 1 and puts in one box
 *
 * 2 apples 2 boxes
 * P1 1->1 1->1
 * P2 1->1 1->1
 * same
 * 2 apples 1 box
 * P1 2->1
 * p2 1->1 1->1
 *
 * n is apples
 * k boxes
 * if it is n is mulitpel of k2 or if is a mulitple of the n2 then the distribution will be equal
 *
 */
public class DSTAPLS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            long n = scan.nextLong();
            long k = scan.nextLong();
            boolean isSame = n%(k*k) == 0;



            if(isSame){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
