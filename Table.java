import java.util.Scanner;
class Table
{
public static void main(String a[ ])
 {
  int x;
  Scanner A=new Scanner(System.in);
  System.out.println("Enter any no.: ");
  x=A.nextInt();
  for(int i=1;i<=10;i++)
  {
   System.out.println(x+"*"+i+"="+(x*i));
  }
 }
}