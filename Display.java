import java.util.Scanner;

class Display
{
	public static void main(String a[]) {
	    int x; float y; String name; double d; 
            Scanner Sc= new Scanner(System.in);
            x=Sc.nextInt();
            y=Sc.nextFloat();
            name=Sc.next();
            d=Sc.nextDouble();
		System.out.println(x+" "+y+" "+name+" "+d);
	}
}
