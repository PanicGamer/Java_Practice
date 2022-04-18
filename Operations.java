/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class Operations
  {
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number: ");
  int a=sc.nextInt();
      System.out.println("Enter second number:");
  int b=sc.nextInt();
    

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
System.out.print("Difference of 2 numbers :  ");
  System.out.println(a-b);
     System.out.print("Product of 2 numbers  : ");
  System.out.println(a*b);
     System.out.print("Division of 2 numbers: ");
  System.out.println(a/b);
     System.out.print("Increment and Decrement the number  :  ");
  System.out.println(++a);
      System.out.println(--a);
      System.out.print("Remainder of 2 numbers:");
  System.out.println(a%b);
//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

  }
  }  