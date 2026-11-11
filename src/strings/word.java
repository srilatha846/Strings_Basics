
package strings;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = obj.nextLine();

        System.out.println("Enter a character:");
        char ch = obj.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println(ch + " occurs " + count + " times");
    }
}