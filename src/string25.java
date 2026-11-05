import java.util.Scanner;
public class string25 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String k=obj.nextLine();
        if(k.length()!=1)
        {
            k=" "+k+"";
        }
        if(s.contains(k))
        {
            System.out.print("yes");
        }
        else {
            System.out.print("n0");
        }
    }
}
