package CodeChef.cookOff.cookOff.JUNE19;

import java.util.Arrays;
import java.util.Scanner;

/***
 * @Link : https://www.codechef.com/JUNE19B/problems/SNCK99
 *
 * @Problem : 
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @Sample
 *
 * @ideas
 *
 * TODO : READ
 */
public class SNCK99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node a[] = new Node[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Node(scan.nextInt());
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
    static class Node implements Comparable<Node>{
        int data;
        Node(int data){
            this.data = data;
        }
        public int compareTo(Node node) {
            return node.data - this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }
}
