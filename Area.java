import java.util.*;
public class Area
{
  int Square(int a)
  {
    a = a*a;
    return a;
  }
  double Circle(double r)
  {
     r = 3.14*r*r;
  return r;
  }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the length of the square");
      int a= sc.nextInt();
       System.out.println("enter the radius of the circle");
      double r = sc.nextInt();
     
      Area b = new Area();
       r = b.Circle(r);
       a = b.Square(a);
     
      System.out.println(a);
       System.out.println(r);
    }
}