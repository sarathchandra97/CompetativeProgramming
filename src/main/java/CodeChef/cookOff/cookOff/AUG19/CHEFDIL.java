package CodeChef.cookOff.cookOff.AUG19;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/AUG19B/problems/CHEFDIL
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
 * 11111110
 * 1111110
 * 11110
 * 0
 *
 * 101
 * 0 0
 *
 * 00
 *  1
 *
 * 000
 *  10
 *  0
 *
 * 000101
 * 0000 0
 * 001
 * 1 0
 * 1
 *
 * 001000
 * edge 1 are not valid
 *
 * middle 1
 * 01110
 *
 * 11000111
 * ->11111111
 * or
 * ->10 10111
 * ->0  0 011
 *
 *
 * even 0's it will add 1 on one side
 * odd 0's can clear itself
 *
 * it should have odd 0's that final
 * see one odd is enough to add another odd
 * it is like a chain reaction can clear everthing
 */
public class CHEFDIL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            String s  = scan.next();
            int count0 = 0;
            for(char c : s.toCharArray()){
                if (c == '0')
                    count0++;
            }
            if(count0%2==1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
