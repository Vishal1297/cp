package codechef.snackdown_2021;

import java.util.Scanner;

public class TestMatchSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0){
            int round1 = scanner.nextInt();
            int round2 = scanner.nextInt();
            int round3 = scanner.nextInt();
            int round4 = scanner.nextInt();
            int round5 = scanner.nextInt();
            int indiaScore = 0, englandScore = 0;
            if (round1 == 1) indiaScore++;
            else if (round1 == 2) englandScore++;
            if (round2 == 1) indiaScore++;
            else if (round2 == 2) englandScore++;
            if (round3 == 1) indiaScore++;
            else if (round3 == 2) englandScore++;
            if (round4 == 1) indiaScore++;
            else if (round4 == 2) englandScore++;
            if (round5 == 1) indiaScore++;
            else if (round5 == 2) englandScore++;

            if (indiaScore > englandScore) System.out.println("INDIA");
            else if (indiaScore < englandScore) System.out.println("ENGLAND");
            else System.out.println("draw");
        }
        scanner.close();
    }
}
