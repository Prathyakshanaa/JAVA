import java.util.Scanner;
public class MergeTwoArrays
{
public static void main(String[] args)
{
int i, k=0;
int[] a = new int[5];
int[] b = new int[5];
int[] c = new int[10];
Scanner scan = new Scanner(System.in);
System.out.print("Enter 5 Elements for First Array: ");
for(i=0; i<5; i++)
a[i] = scan.nextInt();
System.out.print("Enter 5 Elements for Second Array: ");
for(i=0; i<5; i++)
b[i] = scan.nextInt();
for(i=0; i<5; i++, k++)
c[k] = a[i];
for(i=0; i<5; i++, k++)
c[k] = b[i];
System.out.println("\nThe merged array is: ");
for(i=0; i<10; i++)
System.out.print(c[i]+ " ");
}
}
