import java.util.Scanner;
public class string26 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String s=obj.nextLine();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(0)==a.charAt(i))
            {
                int j=1;
                for(j=1;j<s.length();j++)
                {
                    if(s.charAt(j)!=a.charAt(i+j))
                        break;
                }
                if(i==s.length())
                    System.out.println(i);
            }

        }
    }
}
