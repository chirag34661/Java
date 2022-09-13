import java.util.Scanner;
public class ReadInput{
    
public static void main(String a[]){
    int x;
    float y;
    double z;
    String c;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextFloat();
      z=sc.nextDouble();
      c=sc.next();
  System.out.println(x+" "+ y+" "+z+" "+c);
 }
}