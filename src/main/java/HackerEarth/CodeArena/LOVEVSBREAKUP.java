package HackerEarth.CodeArena;

import java.util.Scanner;

public class LOVEVSBREAKUP {
    /***
     * @Link : https://www.hackerearth.com/fr/codearena/ring/c31b60e/
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String love = "love";
        boolean res = isSubSequence(love, s, love.length(), s.length());
        if(res)
            System.out.println("I love you, too!");
        else
            System.out.println("Let us breakup!");
    }
    // Returns true if str1[] is a subsequence of str2[]
    // m is length of str1 and n is length of str2
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }
}
