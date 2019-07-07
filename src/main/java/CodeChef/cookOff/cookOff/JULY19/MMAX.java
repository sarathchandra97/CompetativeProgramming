package CodeChef.cookOff.cookOff.JULY19;

import java.math.BigInteger;
import java.util.Scanner;

public class MMAX {
    /***
     * @Link : https://www.codechef.com/JULY19B/problems/MMAX
     *
     * @Problem : Given a chocolates you have to distribute to other in a such a ways the they have minimum
     * sigma|ai - a(I+1)| should be minimum
     *
     *
     * @InputFormat
     *
     * @OuputFormat
     *
     * @Sample
     * 1
     * 3
     * 2
     * :2
     * @ideas
     * minimum distribution makes that choclates are evenly distributed
     * max
     * if even student
     * 1 0
     * 1 0 1 0
     * 1 0 1 0 1
     *
     * if odd studnet
     * 1
     * 1 0 1
     * if remChoclate are more than 1/2 of the student ? here students are even or odd ?
     *
     * if it is less than half
     * one hole makes 2 points except the last one
     * number of holes =
     * 1 0 1 0 1 0 0 0 = 3
     * 0 1 0 1 0 1 0 0 = 4
     *
     * Two major deciding factors
     * is Number of students odd or even
     * is rem choclates more than half or less than half
     *
     * students are even
     *      if rem == half
     *          return students - 1
     *      ir rem < half
     *          we have to distrubtues 1's
     *          2*rem
     *       if rem > half
     *          we have to distrubte 0's
     *          2(studenst*2)
     * students are odd
     *      if rem == half + 1 or rem == half
     *          return students - 1
     *      if rem < half
     *          distribute 1's
     *          i mean they will be in the middle
     *          means every 1 will make 2 point
     *          mean remcholcate * 2
     *      if rem > half
     *          distribute 0's means
     *          (studenst - remcholclat)*2
     *
     * if odd number of students with more than half choclates
     * 5 studnest with 1 cholcat
     * 1 0 0 0 0
     * 0 1 0 0 0
     * 0 0 1 0 0
     * 0 0 0 1 0
     * 5 s with 2 ch
     * 1 0 1 0 0
     * 0 1 0 1 0
     * 0 0 1 0 1
     * 5s with 3 ch
     * 1 1 0 1 0 = 3
     * 1 0 1 0 1 = 4
     * 5s and 4 ch
     *
     * 5s with 5 ch
     * 1 1 1 1 1 = 0
     * even number of students with less number of choclates
     * 4 studenst 1 choclate
     * 1 0 0 0 = 1
     * 0 1 0 0 = 2
     * 0 0 1 0 = 2
     * 0 0 0 1 = 1
     * 4 students 2 choclates
     * 1 0 1 0 = 3
     * 0 1 0 1 = 3
     * 4 studnets 3 choclates
     * 1 1 1 0 = 1
     * 0 1 1 1 = 1
     * 1 0 1 1 = 2
     * 1 1 0 1 = 2
     * 4 studesnt with 4 choclates
     * 1 1 1 1 = 0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            BigInteger studentBigInt = scan.nextBigInteger();
            BigInteger choclateBigInt = scan.nextBigInteger();
            BigInteger remchoclate = choclateBigInt.mod(studentBigInt);

            int students = studentBigInt.intValue();
            int chacos = remchoclate.intValue();
            int half  = students/2;
            int ans;
            if(students%2 == 0 ){
                if(half == chacos) {
                    ans = students - 1;
                }else if(half > chacos){
                    ans = chacos*2;
                }else{
                    ans = (students - chacos)*2;
                }

            }else{
                if(half == chacos || half == chacos+1){
                    ans = students - 1;
                }else if(half > chacos){
                    ans = chacos*2;
                }else{
                    ans = (students - chacos)*2;
                }
            }
            System.out.println(ans);

        }
    }
}
