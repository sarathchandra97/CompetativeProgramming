import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/***
 * @Link : -none-
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
 * Keep it in a set
 * number of visible bottles
 * you can put less radius values
 */

public class Bottles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Long> set = new HashSet<>();
        int count = 0;
        long a[] = new long[n];
        for (int i = 0; i < n ; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(count);
    }
}
