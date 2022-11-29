import java.util.Scanner;
class box
{
  int l,b,h;
  box(){
   int l,b,h;
   Scanner s=new Scanner(System.in); 
   System.out.print("Enter the length,breadth,height of the box respectively: ");
   l=s.nextInt();
   b=s.nextInt();
   h=s.nextInt();
   this.l=l;
   this.b=b;
   this.h=h;
   }
  box(int m){
  m=l=b=h; 
  }
  box(int w,int h,int l)
  {
   this.l=l;
   b=w;
   this.h=h;
  }
  void vol() 
  {
   int vol;
   vol=l*b*h;
   System.out.print("The volume of the box is "+vol);
  }
public static void main(String a[])
 {
  box x=new box();
  box y=new box(3);
  box z=new box(2,3,4);
  z.vol();
  x.vol();
  y.vol();   
 }
}