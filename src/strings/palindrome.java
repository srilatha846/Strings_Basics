package strings;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int flag=1;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                flag=1;
            break;
        }
        if(flag==1)
        {
            System.out.print("PAlindrome");
        }
        else
        {
           System.out.print ("Not a Palindrome");
        }


    }
}
