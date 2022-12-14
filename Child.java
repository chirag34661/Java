import java.util.Scanner;
class Base
{
String name;
int age;
Scanner s=new Scanner(System.in);

void getBaseData()
{
System.out.print("Enter name:");
name=s.next();
System.out.print("Enter your age:");
age=s.nextInt();
}

void showBaseData()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}

class Child extends Base
{
String Branch;
int sem;
Scanner s=new Scanner(System.in);

void getChildData()
{
System.out.print("Enter Branch: ");
Branch=s.next();
System.out.print("Enter semester: ");
sem=s.nextInt();
}

void showChildData()
{
System.out.println("Branch: "+Branch);
System.out.println("Semester: "+sem);
}

public static void main(String a[])
{
 Child c=new Child();
 c.getBaseData();
 c.showBaseData();
 c.getChildData();
 c.showChildData();
}
}