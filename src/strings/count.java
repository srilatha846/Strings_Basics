package strings;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = obj.nextLine();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(s.trim());
    }
}