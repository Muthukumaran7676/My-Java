import java.util.Scanner;
class hello{
   public static void main(String args[]){

      int score = 95;

      if(score>=50 && score<60)
      {
            System.out.print("You Obtained Grade - C");
      }   
      else if(score>=60 && score<70)
      {
         System.out.print("You Obtained Grade - B");
      }
      else if(score>=70 && score<80)
      {
         System.out.print("You Obtained Grade - B+");
      }
      else if(score>=80 && score<90)
      {
         System.out.print("You Obtained Grade - A");
      } 
      else if(score>=90 && score<95)
      {
         System.out.print("You Obtained Grade - A+");
      }
      else if (score>=95)
      {
         System.out.print("You Obtained Grade - O");
      }
    }
}