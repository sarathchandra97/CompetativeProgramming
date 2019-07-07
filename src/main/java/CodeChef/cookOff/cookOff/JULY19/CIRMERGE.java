package CodeChef.cookOff.cookOff.JULY19;


import java.util.Scanner;


public class CIRMERGE {
    /***
     * @Link : https://www.codechef.com/JULY19B/problems/CIRMERGE
     *
     * @Problem : find the minimum penalty
     *
     * @InputFormat
     *
     * @OuputFormat
     *
     * @Sample
     * 1
     * 3
     * 10 10 1
     * : 32
     * @ideas
     * Greedy
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            Node parent = new Node(0,scan.nextInt());
            Node current = parent;
            for (int i = 1; i < n; i++) {
                    current.next = new Node(i,scan.nextInt());
                    current = current.next;
            }
            current.next = parent;

            int totalPenality = 0;
            current = parent;
            while (current.next != current){

                // Find the minIndex and minValue
                int minIndex = current.index ;
                int minValue  = Integer.MAX_VALUE;

                while (!current.beenhere){
                    if(minValue > current.data + current.next.data){
                        minValue = current.data + current.next.data;
                        minIndex = current.index;
                    }
                    current.beenhere = true;
                    current = current.next;
                }

                // update the beehere to all false
                current = clear(current);

                // Merge the minIndex with the future one
                while (!current.beenhere){
                    if(current.index == minIndex){
                        totalPenality += minValue;
                        current.data = minValue;
                        current.next = current.next.next;
                    }
                    current.beenhere = true;
                    current = current.next;
                }

                // Update the beenHere to false
                current = clear(current);

            }
            System.out.println(totalPenality);


        }
    }

    private static Node clear(Node current) {
        while (current.beenhere){
            current.beenhere = false;
            current = current.next;
        }
        return current;
    }


    static class Node{
        int index;
        int data;
        boolean beenhere = false;
        Node next;

        Node(int index, int data) {
            this.index = index;
            this.data = data;

        }
    }
}
