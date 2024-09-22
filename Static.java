/*import java.util.Scanner;

class kumaran

   /* { int a;
      float b;
      char ch;
      String name;
      boolean val;
      a=20;
      b=22;
      ch='b';
      name="kumaran";
      val=true;
      System.out.println(a+"\n"+b+"\n"+ch);
      System.out.println(name+"\n"+val);
  }
  { 
    Scanner sc = new Scanner(System.in);
        int age;
        float fees;
        char gender;
        String name;
        System.out.println("Enter the given details:");
        age = sc.nextInt();
        fees = sc.nextFloat();
        gender = sc.next().charAt(0);
        name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"Gender: "+gender+"\n"+"Fees: "+fees);2525
  }
  {
      int a=10;
      static int b= 20;      
      void display()
      {
        a=20;
        b=200;
        System.out.println("a:"+a+"\n"+"b:"+b);
      }
      public static void main(String[]args){
        kumaran k=new kumaran();
       k.display();
      }
  }
  public class Static {
    int a = 10;
    static int b = 20;
    void display(){
        a++;
        b++;
        System.out.println("a: "+a+"\n"+"b: "+b);
    }
    public static void main(String[] args) {
        Static s = new Static();
        Static s1 = new Static();
        Static s2 = new Static();
        s.display();
        s1.display();
        s2.display();
    }
    
}*/
import java.util.Scanner;
public class Static {

  int a=100;
  void display(int a)
  {
    a++;
    System.out.println("a:"+a);}
    public static void main(String[]args){
      Static s=new Static();
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      s.display(a);
    }
  }

/*import java.util.*;
class Area
{
  void square()
  {
    int a = a*a;
    System.out.println(a)
  }
  double Circle(double r)
  {
    double r = 3.14*r*;
  return r;
  }
    public Static void(String[]a)
    {
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      System.out.println("enter the length of the square");
      double r = sc.nextInt();
      System.out.println("enter the radius of the circle");
      Area b = new Area();
      double r = b Circle(r);
      int a = b.square();
      System.out.println(r);
    }
}*/