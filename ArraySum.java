import java.util.Scanner;
class ArraySum
{
 public static void main(String a[])
 {
  Scanner Q=new Scanner(System.in);
  int s[][]=new int[3][3];
  int b[][]=new int[3][3];
  System.out.println("Enter the elements of the first array: ");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    s[i][j]=Q.nextInt();
   }
  }
  System.out.println("Enter the elements of the second array: ");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    b[i][j]=Q.nextInt();
   }
  }
  System.out.print("\nThe elements of the first array:\n");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.print(s[i][j]+"  "); 
   }
   System.out.print("\n");
  }
  System.out.print("\nThe elements of the second array:\n");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.print(b[i][j]+"  "); 
   }
   System.out.print("\n");
  }
  System.out.print("The sum of the elements of the arrays\n");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.print(s[i][j]+b[i][j]+"  ");
   }
   System.out.print("\n"); 
  }  
 }
}