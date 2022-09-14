import java.util.Scanner;
class Swap
{
 public static void main(String a[])
 {
  int x,y;
  Scanner Sc= new Scanner(System.in);
  System.out.println("Enter any two number: ");
  x=Sc.nextInt();
  y=Sc.nextInt();
  x=x+y;
  y=x-y;
  x=x-y;
  System.out.println("Numbers after swapping "+x+" "+y);
 }

}