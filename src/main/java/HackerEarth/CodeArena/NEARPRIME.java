package HackerEarth.CodeArena;

import java.util.*;
import java.util.stream.Stream;

/***
 * @Link : https://www.hackerearth.com/codearena/ring/180a153/
 *
 * @Problem : 
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @SampleInput
 * 5
 * 1 2 3 1 6
 * @SampleOutput
 * 2 2 3 3 3
 *
 * @ideas
 *
 * @todo
 * to have a code writen to have all the primes
 * tought to debug
 * thought easy to implement
 * left ->
 * right ->
 * final comupation for the leaf Nearest adn Right Nearest
 */
public class NEARPRIME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set primes = new HashSet<Integer>();
        primes.addAll(sieveOfEratosthenes(10^6));

        Street  streets[] = new Street[n];
        for (int i = 0; i < n; i++) {
            streets[i] = new Street(scan.nextInt(), Integer.MIN_VALUE + 10^5, Integer.MAX_VALUE - 10^5);
        }

        // Left Fill
        int current = -1;
        for (int i = 0; i < n; i++) {
            if(primes.contains(streets[i].getCurrentNumber())){
                current = i;
            }
            if(current!=-1){
                streets[i].setLeftNearest(current);
            }
        }


        // Right Fill
        current = -1;
        for (int i = n-1; i > -1; i--) {
            if(primes.contains(streets[i].getCurrentNumber())){
                current = i;
            }
            if(current!=-1){
                streets[i].setRightNearest(current);
            }
        }

        // Taking the nearest one
        for (int i = 0; i < n; i++) {
            if(i - streets[i].getLeftNearest() > streets[i].getRightNearest())
                streets[i].setFinalNearest(streets[streets[i].getRightNearest()].getCurrentNumber());
            else
                streets[i].setFinalNearest(streets[streets[i].getLeftNearest()].getCurrentNumber());
        }

        for (Street street : streets){
            System.out.print(street.getFinalNearest()+" ");
        }
        System.out.println();
        
        
    }
    static class Street{
        int currentNumber;
        int leftNearest;
        int rightNearest;
        int finalNearest;

        public Street(int currentNumber, int leftNearest, int rightNearest) {
            this.currentNumber = currentNumber;
            this.leftNearest = leftNearest;
            this.rightNearest = rightNearest;
        }

        public int getFinalNearest() {
            return finalNearest;
        }

        public void setFinalNearest(int finalNearest) {
            this.finalNearest = finalNearest;
        }


        public int getCurrentNumber() {
            return currentNumber;
        }

        public void setCurrentNumber(int currentNumber) {
            this.currentNumber = currentNumber;
        }

        public int getLeftNearest() {
            return leftNearest;
        }

        public void setLeftNearest(int leftNearest) {
            this.leftNearest = leftNearest;
        }

        public int getRightNearest() {
            return rightNearest;
        }

        public void setRightNearest(int rightNearest) {
            this.rightNearest = rightNearest;
        }
    }
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
