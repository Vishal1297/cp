package codechef.snackdown_round_1A_2021;

import java.util.Scanner;

public class RoundRobinRanks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int result = 2 * ( n - k );
            result += 2 * (( k - 1) / 2);
            System.out.println(result);
        }
        scanner.close();
    }
}
