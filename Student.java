import java.util.Scanner;
class Student
{
 String name;
 float cgpa;
 int age;
public static void main(String a[])
{
 Student S=new Student();
 Scanner x=new Scanner(System.in);
 System.out.print("Enter your name:");
 S.name=x.next();
 System.out.print("Enter age:");
 S.age=x.nextInt();
 System.out.print("Enter CGPA:");
 S.cgpa=x.nextFloat();
 System.out.println("\nThe name of the student is "+S.name +".\nThe age of the student is "+S.age +".\nCGPA:" +S.cgpa);
}
}