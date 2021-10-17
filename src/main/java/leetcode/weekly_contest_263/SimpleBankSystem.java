package leetcode.weekly_contest_263;

import java.util.*;

public class SimpleBankSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] values = new long[]{10, 100, 20, 50, 30};
        Bank bank = new Bank(values);
        System.out.println(bank.withdraw(3, 10));
        System.out.println(bank.deposit(5, 20));
        System.out.println(bank.transfer(5, 1, 20));
        System.out.println(bank.withdraw(10, 50));
        scanner.close();
    }

    static class Bank {
        Map<Integer, Long> map;

        public Bank(long[] balance) {
            map = new HashMap<>();
            for (int i = 0; i < balance.length; i++) {
                map.put(i + 1, balance[i]);
            }
        }

        public boolean transfer(int account1, int account2, long money) {
            if (!map.containsKey(account1) || !map.containsKey(account2)) {
                return false;
            }
            long current1 = map.get(account1);
            long current2 = map.get(account2);
            if (current1 < money) {
                return false;
            }
            map.put(account1, current1 - money);
            map.put(account2, current2 + money);
            return true;
        }

        public boolean deposit(int account, long money) {
            if (!map.containsKey(account)) {
                return false;
            }
            map.put(account, map.get(account) + money);
            return true;
        }

        public boolean withdraw(int account, long money) {
            if (!map.containsKey(account)) {
                return false;
            }
            long current = map.get(account);
            if (current >= money) {
                map.put(account, current - money);
                return true;
            }
            return false;
        }
    }
}
