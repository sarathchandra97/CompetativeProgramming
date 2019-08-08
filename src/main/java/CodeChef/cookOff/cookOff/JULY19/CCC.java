package CodeChef.cookOff.cookOff.JULY19;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/JULY19B/problems/CCC
 *
 * @Problem :
 * Given the coconuts and there minimum number of strike that need to be hit to make it broke
 * you have to make minimum number of hits to get needed number of coconuts for you(Z)
 *
 * @InputFormat
 * number of test case
 *      number of cocunuts number of coconuts you want
 *      min of all the coconuts in an array
 * @OuputFormat
 *  minimum number of hits
 * @Sample
 * 2
 * 2 1
 * 50 55
 * 2 1
 * 40 100
 *
 * 55
 * 80
 *
 * @ideas
 * start hitting the coconuts should i shitt or should i wait ?
 * if the other coconut all combined is less than this one you can shift unless hit the same coconut until it break
 *
 * In the worst case you will get the longest coconut first you
 * (coconut power - number of hits you make ) > sum(all the remaning cocount)
 * you can shift
 *
 * How should i decide how many number of hits i want to make ?
 * if you z coconuts then you have to take Zth elements from a sorted decreasly array
 *
 * lets take example
 * 3 coconuts
 * 3 2 1
 *
 * i want 1
 * min is 3
 * either i can hit the same coconut 3 times or
 * each coconut 1 time
 *
 * if z is 1
 *
 * 4 2 1
 * : 1
 * each coconut 1 time ?
 * min (smallest * noof coconuts , highest-power)
 *
 * 4 2 2
 * z: 1 - ans 4
 * z : 2 ans 6
 *
 * 4 3 2
 *
 * min([last z elements],)
 * min(sum of first z elements)
 *
 * what is the optimaal ?
 *
 * if a new coconut makes how will take effect the present one ?
 * 10 [10] 1 : 10
 * 2 [10,2] 1 : 4
 * 1 [10,2,1] : 3
 * 3 [10,3,2,1] : 4
 *
 * [10,20,30] 1 : 30
 * [10,20,30] 2 : 60,
 * dp is not working because after some the only value is not enough the value insdie it is also neede
 *
 *
 * Greedy solution will be
 * max(sum-of-last-z-elements,number-of-coconuts*last(z))
 * z = 4;
 * n = 6;
 * 0 1 2 3 4 5
 *     n-4 n-3  n-2  n-1
 *     n-z
 */
public class CCC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int z = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);

            int minsum = 0;
            for (int i = n-z; i < n; i++) {
                minsum += a[i];
            }
            // index will be on the first one of the window of the array
            int index = n-z;
            int minhit = a[z-1];
            while (index > 0 && minsum > minsum + ifIGiveTheHighest(index, a, minhit, z)){
                // should a shift or stay where i am
                // like a sliding window
                minsum  += ifIGiveTheHighest(index, a, minhit,z);
                index--;

            }
            System.out.println(minsum);


        }
    }

    private static int ifIGiveTheHighest(int index, int[] a, int minhit,int z) {

        // index will never be 0 so there is no concept of underflow
        // index leave the highest one i have to make the minimum number of hit i have to make is a[z-1]
        // if the choose the next best one a[index-1] // 1 minus the start of the array
        return minhit + a[index-1] - a[index+z-1];
    }

    void impl1(){
        // why it is wrong
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int z = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int minHits = a[z-1];
            int maxSum = 0;
            for(int i = n-1 ; i >= (n-z) ; i--){
                maxSum += a[i];
            }
            System.out.println(Math.min(minHits*n,maxSum));

        }
    }
}
