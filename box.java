import java.util.Scanner;
class box
{
  int l,b,h;
  box(){
   int l,b,h;
   Scanner s=new Scanner(System.in); 
   System.out.println("Enter the length,breadth,height of the box respectively: ");
   l=s.nextInt();
   b=s.nextInt();
   h=s.nextInt();
   this.l=l;
   this.b=b;
   this.h=h;
   }
  box(int m){
 l=b=h=m; 
  }
  box(int w,int h,int l)
  {
   this.l=l;
   b=w;
   this.h=h;
  }
  box(box ob)
  {
   l=ob.l;
   b=ob.b;
   h=ob.h;
   }
  void vol() 
  {
   int vol;
   vol=l*b*h;
   System.out.println("The volume of the box is "+vol);
  }
public static void main(String a[])
 {
  box x=new box();
  box y=new box(3);
  box z=new box(2,3,4);
  box i=new box(z);
  x.vol();
  y.vol();
  z.vol();
  i.vol();   
 }
}