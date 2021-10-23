package codechef.snackdown_2021;

import java.util.*;

public class MaxNoDistinctElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int N = scanner.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }
            Arrays.sort(B);
            int k = 0;
            for (int i = 0; i < N; i++) {
                if (B[i] > k){
                    B[i] = k;
                    k++;
                }else if (B[i] == k){
                    B[i] = k;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
