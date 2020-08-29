/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX6;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class Abstract {
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks of student A\n");
        double a1=obj.nextDouble();
        double a2=obj.nextDouble();
        double a3=obj.nextDouble();
        System.out.println("\nEnter the marks of student B\n");
        double b1=obj.nextDouble();
        double b2=obj.nextDouble();
        double b3=obj.nextDouble();
        double b4=obj.nextDouble();
        A obj1=new A(a1,a2,a3);
        obj1.getpercentage();
        
        B obj2=new B(b1,b2,b3,b4);
        obj2.getpercentage();
    }
}
abstract class mark
{
    abstract void getpercentage();
}

class A extends mark
{
  double mark1,mark2,mark3;
  A(double m1,double m2,double m3)
  {
      mark1=m1;
      mark2=m2;
      mark3=m3;
  }
  void getpercentage()
  {
      System.out.println("\n\nMarks obtained by student A is:");
      System.out.println("\nMATHS:"+mark1+"\nSCIENCE:"+mark2+"\nSOCIAL:"+mark3);
  }
}

class B extends mark
{
  double mark1,mark2,mark3,mark4;
  B(double m1,double m2,double m3,double m4)
  {
      mark1=m1;
      mark2=m2;
      mark3=m3;
      mark4=m4;
  }
  void getpercentage()
  {
      System.out.println("\n\nMarks obtained by student B is:");
      System.out.println("\nENGLISH:"+mark1+"\nMATHS:"+mark2+"\nSCIENCE:"+mark3+"\nSOCIAL:"+mark4);
  }  
}