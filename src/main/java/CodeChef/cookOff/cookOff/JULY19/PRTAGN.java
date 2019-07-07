package CodeChef.cookOff.cookOff.JULY19;




import java.util.*;

/***
 * @Link : https://www.codechef.com/JULY19B/problems/PRTAGN
 *
 * @Problem :
 * take a empty set add a elemet
 *
 * @InputFormat
 *
 * @OuputFormat
 *
 * @Sample
 * 1
 * 3
 * 4
 * 2
 * 7
 * :
 * 0 1
 * 1 2
 * 3 4
 *
 * @ideas
 *
 * TODO :
 */
public class PRTAGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int n = scan.nextInt();
            HashSet<Integer> set = new HashSet<Integer>();
            int odd = 0,even = 0;
            for (int i = 0; i < n; i++) {
                int ele = scan.nextInt();
                List<Integer> list = new ArrayList<Integer>(set);
                for(int j : list){
                    if(hasEvenBits(ele^j))
                        even++;
                    else
                        odd++;
                    set.add(ele^j);
                }
                if(hasEvenBits(ele))
                    even++;
                else
                    odd++;
                set.add(ele);
                System.out.println(even+" "+odd);
            }

        }
    }

    private static boolean hasEvenBits(int ele) {
        int temp = 1;
        temp <<= 30;
        int count = 0;
        for( ; temp > 0 ; temp >>= 1){
            if((ele&temp) > 0)
            count++;
        }

        return count%2 == 0 ;
    }

}
