package codechef.snackdown_round_1A_2021;

import java.util.Scanner;

/**
 * Problem Statement: https://www.codechef.com/SNCK1A21/problems/DANCEMOVES
 */

public class DanceMoves {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x <= y) {
                System.out.println((y - x + 1) / 2 + (y - x) % 2);
            } else {
                System.out.println(x - y);
            }
        }
        scanner.close();
    }
}
