import java.util.Scanner;
public class Reverse
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String s=sc.nextLine();
  System.out.println("After Reversing A String");
  {
   for(int i=s.length();i>0;i--)
   {
    System.out.print(s.charAt(i-1));
   }
  }
 }
}
