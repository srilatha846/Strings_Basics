import java.util.Scanner;
class pancard {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int c=0;

        if(s.length()!=10)
        {
            System.out.print("Invalid");
        }
        else {

            for (int i = 0; i < s.length(); i++) {
                if (i <= 2 || i == 4 || i == 9) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        c++;
                } else if (i != 3) {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        c++;
                } else {
                    if (s.charAt(i) == 'p' && s.charAt(i) == 'F' && s.charAt(i) == 'A' && s.charAt(i) == 'T' && s.charAt(i) == 'H' && s.charAt(i) == 'C')
                        c++;
                }
            }
        }
        if(c==10)
        {
            System.out.print("Valid");
        }
        else {
            System.out.print("Invalid");
        }

    }
}
