
import java.util.Scanner;
class A {
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        String s = obj.next();int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                count++;
            }
        if(s.length()==12&&count==12)
        {
            System.out.print("Valid");
        }
        else

        {
            System.out.print("Invalid");
        }
    }
}

