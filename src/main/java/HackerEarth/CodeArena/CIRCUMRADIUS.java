package HackerEarth.CodeArena;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CIRCUMRADIUS {
    /***
     * @Link :https://www.hackerearth.com/codearena/ring/ad61167/
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
     * * https://www.mathopenref.com/trianglecircumcircle.html - apply the direct formuatle
     * https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
     *
     * @Need to learn
     *
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();

            double radius = a*b*c/Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c));
            double pi = 3.1415;
            double area = radius*radius*pi;

            System.out.printf("%.4f",area);
            System.out.println(Math.ceil(area));






        }

    }
}
