/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class SumWithoutPlus {
public static void main(String args[]){
  int carry;
   Scanner sc=new Scanner(System.in);{
      System.out.println("Enter first number: ");
  int a=sc.nextInt();
      System.out.println("Enter second number: ");
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
     
while(b!=0){
  carry = a&b;
  a=a^b;
  b=carry<<1;
}
//check if the second number is greater than zero then increase first number and decrease second number

//check if the second number is less than zero then decrease first number and increase second number

//print result
System.out.println("sum of two numbers : "+a);
}
  }
}