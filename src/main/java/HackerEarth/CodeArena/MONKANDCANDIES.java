package HackerEarth.CodeArena;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MONKANDCANDIES {
    /***
     * @Link : https://www.hackerearth.com/codearena/ring/b3d399b/
     *
     * @Problem :
     *
     * @InputFormat
     *
     * @OuputFormat
     *
     * @SampleInput
     * 1
     * 5 3
     * 2 1 7 4 2
     *
     * @SampleOutput
     *
     * @ideas
     *
     * @todo
     * converting Arrays to list
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) {
                maxHeap.add(scan.nextLong());
            }
            long howManyCandiesMonkAte = 0;
            for (int i = k; i > 0; i--) {
                long ele = maxHeap.poll();
                howManyCandiesMonkAte += ele;
                maxHeap.add(ele/2);
            }
            System.out.println(howManyCandiesMonkAte);
        }
    }

}
