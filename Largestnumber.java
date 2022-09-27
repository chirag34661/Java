import java.util.Scanner;
class Largestnumber
{
public static void main(String a[])
 {
Scanner S=new Scanner(System.in);
int n;
System.out.print("Enter the size of the Array: ");
n=S.nextInt();
int x[]=new int[n]; int max;
System.out.print("\nEnter the elements of the array: ");
for(int i=0;i<n;i++)
  {
   x[i]=S.nextInt(); 
  }
max=x[0];
for(int i=1;i<n;i++)
  {
   if(max<x[i])
   {
   max=x[i];
   }
  }
  System.out.println("The largest number in the Array is "+max);
 }
}