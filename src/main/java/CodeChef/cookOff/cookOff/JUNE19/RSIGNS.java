package CodeChef.cookOff.cookOff.JUNE19;



import java.util.*;

/***
 * @Link : https://www.codechef.com/JUNE19B/problems/RSIGNS
 *
 * @Problem : Given number form 1 - 10^k -1 find the number of disticnt 2 digit numbers on both sides
 *
 * @InputFormat :
 * tc
 *      number of total signs
 *
 * @OuputFormat
 *
 * @Sample
 *
 * @ideas
 * > The signs will always be odd
 * > Anwser will be always be odd first face will repeated with the last
 * > In a tree to be a perfect intersect on the vetric should be in the
 * there are no intersection like X
 * It will always be of Y or T
 *
 *  0 1 2 3 4
 *  9 8 7 6 5
 * TODO : THINK
 */

public class RSIGNS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int k = scan.nextInt();
            if(k==1){
                System.out.println(10);
                continue;
            }
            int mod = 1000000007;
            System.out.println((5*power(2,k,mod))%mod);

        }
    }

    private static long power(long base, long power, long mod) {
        long ret = 1;
        if(power == 0)
            return  1;
        if(power == 1)
            return base;

        ret = power(base,power/2,mod);
        ret *= ret;
        ret %= mod;
        if(power%2 == 1)
            ret*=base;
        return ret%mod;
    }
}
