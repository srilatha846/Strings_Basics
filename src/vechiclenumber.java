import java.util.Scanner;
 class vechiclenumber {
     public static void main(String[] args)
     {
         Scanner obj=new Scanner(System.in);
         String s = obj.nextLine();

         if(s.length() == 13 && s.charAt(2) == ' ' && s.charAt(5) == ' ' && s.charAt(8) == ' ')
         {
             s = s.replace(" ", "");
         }

         if(s.length() == 12 && s.charAt(2) == ' ' && s.charAt(5) == ' ' && s.charAt(7) == ' ')
         {
             s = s.replace(" ", "");
         }

         boolean b=s.length()==10||s.length()==9;
         for(int i=0;i<s.length();i++)
         {
             if(i<=1||i==4||(i==5&&s.length()==10))
                 b=s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';
             else
                 b=s.charAt(i) >= '0' && s.charAt(i) <= '9';
         }
         if(b)
         {
             System.out.print("Valid");

         }
         else {
             System.out.print("Invalid");
         }


     }
}
