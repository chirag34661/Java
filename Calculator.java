import java.util.Scanner;
class Calculator
{
 public static void main(String a[ ])
 {
  Scanner Sc=new Scanner(System.in);
  int x,y;
  char operation;
  System.out.println("--------------CALCULATOR--------------");
  x=Sc.nextInt();
  operation=Sc.next().charAt(0);
  y=Sc.nextInt();
  switch(operation)
  {
   case '+':System.out.println("Sum = "+ (x+y));break;
   case '-':System.out.println("Difference = "+ (x-y));break;
   case '*':System.out.println("Product = "+ (x*y));break;
   case '/':System.out.println("Division = "+ (float)(x/y));break;    
   default:System.out.println("Not Valid Operation!");         
  } 
 }
}