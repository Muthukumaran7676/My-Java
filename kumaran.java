import java.util.Scanner;

class kumaran
{public static void main(String args[])
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
  }*/
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
}