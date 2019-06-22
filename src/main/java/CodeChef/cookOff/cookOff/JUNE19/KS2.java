package CodeChef.cookOff.cookOff.JUNE19;

import java.util.*;

public class KS2 {
    /**
     * link : https://www.codechef.com/JUNE19B/problems/KS2
     * problem : Given a number need to print ith round number where a
     *           round number mean it's sum of all digits will be be a mulitple of 10
     * input
     * output
     *
     * sample input /output
     *
     * ideas
     * brute fource won't work - 264 is the largest number
     *
     * get all the numbers which makes from 1 digit to ? digits
     *  and for each set permutate the digits
     *  then
     *  sort those integer
     *  take and give when he asks - Not works because of the first permutation need to loop all the possible number to get a pair
     *
     * from the input (nope)
     *
     * can find next (nope actually)
     *
     * > I found that in one hunder elements bag there will be 10 numbers with sum of 10 digits with the difference of 10
     * > Based on the bag index the position will shift
     *
     * status : Done
     */
    /**
     *
     * i have added 0 to my list os
     * my x+1 is there x
     * there x is my x+1
     *
     *  0  19  28  37  46  55  64  73  82  91
     * 109 118 127 136 145 154 163 172 181 190
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            long n = scan.nextLong() + 1;
            long bagIndex = bagIndexOfElement(n);


            int count = 0;
            for (long i = bagIndex*100  ; i <= bagIndex*100 + 100; i++) {
                if(sumOfDigits(i) == 0)
                    count++;
                if(count ==  indexOfElement(n)){
                    System.out.println(i);
                    break;

                }
            }


        }

    }

    /**
     * 1 - 1
     * 10 - 0 [0 - 100]
     * 20 - 1 [100 - 200]
     * 11 - 1 []
     */
    private static long bagIndexOfElement(long n) {
        return  n%10 != 0 ? n/10 : (n-1)/10;
    }

    /**
     * 10 - 10
     * 20 - 10
     * 11 - 1
     */
    private static long indexOfElement(long n) {
        return n%10 != 0 ? n%10 : 10 ;
    }

    private static int sumOfDigits(long bagIndex) {
        int ans =0;
        while(bagIndex>0){
            ans += bagIndex%10;
            bagIndex /= 10;

        }
        return ans%10 ;
    }
}
