package codechef.snackdown_2021;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            if (first == 7 || second == 7 || third == 7){
                System.out.println("YES");
            }else System.out.println("NO");
        }
        scanner.close();
    }
}
