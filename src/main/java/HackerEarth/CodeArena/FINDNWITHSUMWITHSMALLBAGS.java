package HackerEarth.CodeArena;

import java.util.Scanner;

public class FINDNWITHSUMWITHSMALLBAGS {
    /***
     * @Link : https://www.hackerearth.com/fr/codearena/ring/3d0dc4d/
     *
     * @Problem : 
     *
     * @InputFormat
     *
     * @OuputFormat
     *
     * @SampleInput
     *
     * 6 9
     * 5 7 1 4 4 1
     *
     * @SampleOutput
     * 1 4
     *
     * @ideas
     *
     * Backtrack all the possible combinarion and return
     * ? if you have the answer how will you sort them
     *
     * using bit masking find all the combination and store the result somewhere
     * and sort the result print the find value
     * the result will Array<Array<int>> of a
     * How to sort Array<Array>in lexiophical order
     *
     * what do you mean by lexicophar order
     * 1 12
     * 1 1 2 - have the same value or different values
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int bags[] = new int[n];
        for (int i = 0; i < n; i++) {
            bags[i] = scan.nextInt();
        }

    }
}
