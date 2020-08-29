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
public class Interfaces {
    
    public static void main(String[] args)
    {
        circle obj=new circle();
        obj.display();
        
        rectangle obj1=new rectangle();
        obj1.display();
    }
}

interface perimeter
{
    void display();
}//2pir
class circle implements perimeter
{
    double r,p;
  public void display()
  {
      Scanner obj=new Scanner(System.in);
      System.out.println("\nEnter the radius of the circle:\n");
      r=obj.nextDouble();
      p=2*3.14*r;
      System.out.println("\nPerimeter of the circle:"+p);
  }
}
//2(l+b)
class rectangle implements perimeter
{
   double l,b,p;
   public void display()
  {
      Scanner obj=new Scanner(System.in);
      System.out.println("\nEnter the length and breadth of the rectangle:\n");
      l=obj.nextDouble(); 
      b=obj.nextDouble();
      p=2*(l+b);
      System.out.println("\nPerimeter of the rectangle:"+p);
  } 
}