package CodeChef.cookOff.cookOff.JUNE19;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/***
 * @Link : https://www.codechef.com/JUNE19B/problems/LENTMO
 *
 * @Problem : Given a array of number and operation you can perform you have to how much you can get finally
 *
 * @InputFormat : Operation with (+) wiht
 * tc
 *      number of elements
 *      elemetsns of array
 *      number of bags
 *      (+) value
 *
 *
 * @OuputFormat
 *
 * @Sample
 *
 * @ideas
 *
 *  for the digits with only one values
 *  k means it has k digits
 *  10^k-1 digits less than
 *  same digti numbers are k with out 0
 *  
 *  000888
 *  08080
 *  090909
 *  _ _ _ k places can be 
 *  [0 - 9 ] = 10 digits 
 *  [ 0 1 2 3 4 ]
 *  [ 9 8 7 6 5]
 *  same number
 *  with 2 unique numbers  * 4c1*2^(k) 
 *  
 *  k = 1 [10]
 *  k = 2 []
 *
 * Status : Done
 */
public class LENTMO {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();

            Node a[] = new Node[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Node(scan.nextInt());
            }
            int k = scan.nextInt();
            int x = scan.nextInt();


            performXor(a,x);
            Arrays.sort(a);
            int profit = calculateProfit(a,k);
            while(profit > 0){
                shiftXor(a,k);
                performXor(a,x);
                Arrays.sort(a);
                profit = calculateProfit(a,k);
            }
            int sum = 0;
            for(Node node : a){
                sum += node.data;
            }
            System.out.println(sum);

        }
    }

    private static void shiftXor(Node[] a, int k) {
        for (int i = 0; i < k; i++) {
            a[i].data = a[i].xor;
        }
    }

    private static int calculateProfit(Node[] a, int k) {
        int currentSum =0;
        int nextSum = 0;

        for(Node node : a){
            currentSum += node.data;
        }

        for (int i = 0; i < k; i++) {
            nextSum += a[i].xor;
        }
        for (int i = k; i < a.length; i++) {
            nextSum += a[i].data;
        }
        return nextSum-currentSum;

    }

    private static void performXor(Node[] a,int x) {
        for(Node node : a){
            node.xor = node.data^x;
        }
    }

    static class Node implements Comparable<Node> {
        int data = 0;
        int xor = 0;
        Node(int data){
         this.data = data;
        }

        public int compareTo(Node node) {
            return (node.xor - node.data) - (this.xor - this.data);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", xor=" + xor +
                    '}';
        }
    }


    }
