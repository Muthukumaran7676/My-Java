import java.util.*;
/*public class Area
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
public class Area{
        public static void main(String[] args) {
        /*String s = "hello all";
        System.out.println("length:"+s.length());
        s=s.trim();
        System.out.println("length:"+s.length());           
        System.out.println(s.indexOf('1'));
        System.out.println(s.lastIndexOf('1'));
        System.out.println(s.charAt(3));
        System.out.println(s.toUpperCase());

        String str="welcome";
        String str1="weLCOME";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        }

}

import java.util.*;
class Length
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name= sc.nextLine();
        int count=0;
        for(int i=0;i<=name.length();i++)
        {
            char x =name.charAt(i);
             System.out.println(x);
            count+=count;
           
        }
     System.out.println(count);  
    }
}*/

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i,count=0;
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            count++;
        }
        System.out.println(count);
        for(i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
    }
    }
}

 
