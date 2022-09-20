import java.util.Scanner;
class Add{
 public static void main(String a[ ]){
   int x,y,z;
   Scanner A=new Scanner(System.in);
   System.out.println("Enter 3 numbers: ");
   x=A.nextInt();
   y=A.nextInt();
   z=A.nextInt();
 
   System.out.println("The sum of three numbers is " + (x+y+z));
   System.out.println("Average is " + (x+y+z)/3.0 );
 }
}