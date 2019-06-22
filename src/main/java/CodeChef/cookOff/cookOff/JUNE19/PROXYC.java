package CodeChef.cookOff.cookOff.JUNE19;

import java.util.*;

/****
 * Link  : https://www.codechef.com/JUNE19B/problems/PROXYC
 * Problem : chef has to attend a min class to pass the attandance twit a proxy can able to tell his
 * attandence only once he is present is i-1 ,i-2 day and i+1 and i+2
 *
 * input
 * test
 *  length of the string
 *  the string itself
 *
 *  ouput
 *  -1 or number of dayse need
 *
 *
 *  sample output and input
 *  1
 * 9
 * PAAPPAPPP
 * :1
 * status : DONE
 */
public class PROXYC {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        int total_test_case = scan.nextInt();
        for (int test_case = 0; test_case < total_test_case; test_case++) {
            // Read inputs
            int d = scan.nextInt();
            String s = scan.next();

            //solve
            int countCanBeProxed = 0;
            for (int i = 2; i < s.length()-2; i++) {
                if(s.charAt(i)=='A' && canBeProxed(s,i))
                    countCanBeProxed++;
            }

            int totalNeededPresent = (int) Math.ceil(d * 0.75);
            int totalPresentOfChef = countOfP(s);
            int delta = totalNeededPresent - totalPresentOfChef;
            if(delta <= 0)
                System.out.println(0);
            else if(delta >0 && delta <=countCanBeProxed)
                System.out.println(delta);
            else
                System.out.println(-1);
            // Print output
        }

        //output
    }

    private static int countOfP(String s) {
        int count =0;
        for (char c : s.toCharArray())
            if(c=='P')
                count++;
        return count;
    }

    private static boolean canBeProxed(String s, int i) {
        return (isP(s.charAt(i-1)) || isP(s.charAt(i-2))) && (isP(s.charAt(i+1)) || isP(s.charAt(i+2)));
    }

    private static boolean isP(char charAt) {
        return charAt == 'P';
    }
}
