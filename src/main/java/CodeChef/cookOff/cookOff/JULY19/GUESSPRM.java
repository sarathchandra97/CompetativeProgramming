package CodeChef.cookOff.cookOff.JULY19;

import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/JULY19B/problems/GUESSPRM
 *
 * @Problem : guess prime you have 2 question to ask and 1 answer to give
 *
 * @InputFormat
 * number of test case
 * 1 question
 * 2 answer
 *  YES or NO
 *
 * @OuputFormat
 *
 * @Sample
 * You           Grader
 *               2
 * 1 3
 *               0
 * 2 3
 *               Yes
 * 1 10
 *               2
 * 1 3
 *               2
 * 2 7
 *               Yes
 *
 * @ideas
 * Use some kinds of chinese reminder theorem
 * No this every simple than that
 * 10^9 can be only divided by 2 or 5
 * other will give the their smallest number
 * i will
 * 1 9 other-than-0
 * sout - than numebr
 * if it is 0
 * then i will
 *
 * TODO :
 */
public class GUESSPRM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int specialNumber = 1<<30;
            System.out.println(1+" "+specialNumber);
            int n = scan.nextInt();
            if(n==0)
                System.out.println(2);
            else
                System.out.println(n+1);

        }
    }
}
