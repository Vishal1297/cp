package leetcode.weekly_contest_263;

import java.util.Scanner;

public class AreNumbersAscending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(areNumbersAscending(inputStr));
        scanner.close();
    }

    public static boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prevNum = 0;
        boolean isAscending = false;
        for (String word : words) {
            if (isInteger(word)) {
                int curr = Integer.parseInt(word);
                if (curr <= prevNum) {
                    isAscending = false;
                    break;
                } else {
                    isAscending = true;
                }
                prevNum = curr;
            }
        }
        return isAscending;
    }

    public static boolean isInteger(String str) {
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
