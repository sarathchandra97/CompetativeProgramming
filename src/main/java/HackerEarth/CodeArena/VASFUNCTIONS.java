package HackerEarth.CodeArena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class VASFUNCTIONS {
    /***
     * @Link : https://www.hackerearth.com/codearena/ring/f2e86b1/
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
        long mod = 1000 * 1000 * 1000 + 7;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ele[] = new int[n];
        for (int i = 0; i < n; i++) {
            ele[i] = scan.nextInt();
        }
        // Precomupation
        long   greatestDivisor[] = new long[n];
        for (int i = 0; i < n; i++) {
            greatestDivisor[i] = goodNumber(ele[i]);
        }

        long[] leftCummulative = new long[n];


        leftCummulative[0] = greatestDivisor[0];
        for (int i = 1; i < n; i++) {
            leftCummulative[i] = (leftCummulative[i-1] * greatestDivisor[i]) % mod;
        }


        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int l = scan.nextInt() - 1;
            int r = scan.nextInt() - 1;
            if(l==0)
                System.out.println(leftCummulative[r]);
            else
            System.out.println(modDivision(leftCummulative[r],leftCummulative[l-1],mod));
        }
    }

    static long modDivision(long a, long  b, long  m) {
        return (a * modInverse(b, m)) % m;
    }

    static long modInverse(long a, long m) {
        a = a % m;
        for (long x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return 1;
    }

    static int goodNumber(int n) {
        // distinct prime factors

        ArrayList<Integer> a = new ArrayList<>(PrimeFactors(n));

        int array[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            array[i] = a.get(i);
        }
        Arrays.sort(array);
        // to store answer
        int ans = 1;

        // product of all distinct prime
        // factors is required answer
        for (int i = 1; i < a.size(); i++) {
            ans *=array[i];
        }



        return ans;
    }

    static Vector<Integer> PrimeFactors(int n) {

        // to store distinct prime factors
        Vector<Integer> v = new Vector<Integer>();
        int x = n;

        // run a loop upto sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (x % i == 0) {

                // place this prime factor in vector
                v.add(i);
                x /= i;
            }
        }

        // This condition is to handle the case when n
        // is a prime number greater than 1
        if (x > 1)
            v.add(x);

        return v;
    }

}
