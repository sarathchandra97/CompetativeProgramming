package HackerEarth.CodeArena;

import java.util.Scanner;

public class TRAPPINGWATER {
    /***
     * @Link : https://www.geeksforgeeks.org/trapping-rain-water/
     *https://www.hackerearth.com/fr/codearena/ring/afe12cb/
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
        int n = scan.nextInt();
        int bars[] = new int[n];
        for (int i = 0; i < n; i++) {
            bars[i] = scan.nextInt();
        }
        System.out.println(findWater(n, bars));
    }

    static int findWater(int n, int[] arr) {
        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }
}
