/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.Scanner;
class ArithmeticException
{
  public static void main(String args[])
  {
 //using scanner we can read i/p from the user storeed in a and b
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    
     int  e=(a*b)/0;
    
   
      
        System.out.println(e);
      
    System.out.println("Exception handled");
  }
}

  //by using try and get method we can exception handled