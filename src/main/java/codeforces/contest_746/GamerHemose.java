package codeforces.contest_746;

import java.io.*;
import java.util.*;

public class GamerHemose {
    public static void main(String[] args) {
        MyScanner scanner = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int weapons = scanner.nextInt();
            int enemyHealth = scanner.nextInt();
            Integer[] weaponsDamages = new Integer[weapons];
            int firstHighestDamage = -1, secondHighestDamage = -1;
            for (int j = 0; j < weapons; j++) {
                weaponsDamages[j] = scanner.nextInt();
                if (weaponsDamages[j] > firstHighestDamage) {
                    secondHighestDamage = firstHighestDamage;
                    firstHighestDamage = weaponsDamages[j];
                }else {
                    if (weaponsDamages[j] > secondHighestDamage){
                        secondHighestDamage = weaponsDamages[j];
                    }
                }
            }
            if (enemyHealth <= firstHighestDamage){
                out.println(1);
            }else {
                int sumOfFirstAndSecondHighDamage = firstHighestDamage + secondHighestDamage;
                int result =  2 * (enemyHealth / sumOfFirstAndSecondHighDamage);
                if (enemyHealth % sumOfFirstAndSecondHighDamage == 0) {
                    out.println(result);
                }else if (enemyHealth % sumOfFirstAndSecondHighDamage <= firstHighestDamage) {
                    out.println(result + 1);
                }else {
                    out.println(result + 2);
                }
            }
        }
        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}