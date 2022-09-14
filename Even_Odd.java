import java.util.Scanner;
class Even_Odd
{
public static void main(String a[])
 {
  int x;
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter any no.: ");
  x=Sc.nextInt();
  if(x%2==0)
  {
   System.out.println("The number is even.");
  }
  else
  {
    System.out.println("The number is odd.");
  }
 }
}