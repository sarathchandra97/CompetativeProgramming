package HackerEarth.CodeArena;

import java.util.*;

public class TRAIN {
    /***
     * @Link : https://www.hackerearth.com/codearena/ring/e3c0b94/
     *
     * @Problem : In this subject in the relam has p provicenty and s skill
     * You have to match the new student expected provicenty and expected skill level
     *
     *
     * @InputFormat
     * T
     * M N
     * U V E
     * G H
     *
     * The first line of input contains T. T test cases follow.
     * The first line of each test case has two integers, M and N.
     * In the following M lines, there are two integers on each line, U and V denoting favorite skill and proficiency they wish to obtain.
     * In the N lines that follow, there are two integers on each line, W and X denoting the special skill and the level of proficiency that has been reached.
     * The last line of each test case has two integers, G and H.
     *
     * @OuputFormat
     * GOOD
     * GREAT
     * :(
     *
     * @SampleInput
     *
     * @SampleOutput
     *
     * @ideas
     * Put it in a mulitamp and check for skill level if it is not there than break it 
     * If the skill is there and doon't check for the Provieceiy in the set of Procienty if it is there 
     * then don't change anyhting if it is not there the put it as false 
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_test_cases = scan.nextInt();
        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            int m = scan.nextInt();
            int n = scan.nextInt();

            
            boolean hasSkill = true;
            boolean hasPro = true;

            Map<Integer, Set<Integer>> expreienceMap = new HashMap<>();

            Experience[] experiences = new Experience[m];
            for (int i = 0; i < m; i++) {
                experiences[i] = new Experience(scan.nextInt(), scan.nextInt());
            }
            for (int i = 0; i < n; i++) {
                int s = scan.nextInt();
                int p = scan.nextInt();
                expreienceMap.computeIfAbsent(s, k -> new HashSet<>());
                expreienceMap.get(s).add(p);
            }
            for (Experience experience : experiences){
                int s = experience.getSkill();
                int p = experience.getPro();
                if(!expreienceMap.containsKey(s)){
                    hasSkill = false;
                    break;
                }
                if(!hasPro || !expreienceMap.get(s).contains(p))
                    hasPro = false;

            }
            
            if(!hasSkill){
                System.out.println(":(");
                continue;
            }
            if(!hasPro){
                System.out.println("Good");
            }
            System.out.println("Great");
        }

    }

    static class Experience implements Comparable {
        int skill;
        int pro;

        public int getSkill() {
            return skill;
        }

        public void setSkill(int skill) {
            this.skill = skill;
        }

        public int getPro() {
            return pro;
        }

        public void setPro(int pro) {
            this.pro = pro;
        }

        public Experience(int skill, int pro) {
            this.skill = skill;
            this.pro = pro;
        }

        @Override
        public int compareTo(Object o) {
            Experience otherExperience = (Experience) o;
            return otherExperience.skill - this.skill;
        }
    }
}
