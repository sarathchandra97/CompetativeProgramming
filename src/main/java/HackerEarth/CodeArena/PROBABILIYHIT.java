package HackerEarth.CodeArena;

import java.util.Scanner;

public class PROBABILIYHIT {
    /***
     * @Link :nhttps://www.hackerearth.com/codearena/ring/d2c3340/
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
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();
            int w = scan.nextInt();
            float p1 = scan.nextFloat() / 100;
            float p2 = scan.nextFloat() / 100;
            float f = 0;
            if (x + y < w) {
                System.out.printf("%.6f", f * 100);
                continue;
            }
            if (x > w && y < w) {
                float final_probability = n * p1;
                if (final_probability > 1) {
                    final_probability = 1;
                }
                System.out.printf("%.6f", final_probability * 100);
                continue;

            }
            if (y > w && x < w) {
                float final_probability = n * p2;
                if (final_probability > 1) {
                    final_probability = 1;
                }
                System.out.printf("%.6f", final_probability * 100);
                continue;

            }
            if (y > w && x > w) {
                float maxpropability = Math.max(p1, p2);
                float final_probability = n * maxpropability;
                if (final_probability > 1) {
                    final_probability = 1;
                }
                System.out.printf("%.6f", final_probability * 100);
                continue;

            }
            float final_probability = n * p1 * p2;
            if(final_probability > 1)
                final_probability = 1;
            System.out.printf("%.6f", final_probability * 100);

        }
    }
}
