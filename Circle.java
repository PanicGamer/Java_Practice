//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

   import java.util.Scanner;

   public class Circle
{ 

    //Define main method
     public static void main(String[] args)
 {
    //Declare the variables
     int radius;
     double pi=3.14,circum;
     
   //Use the scanner class to provide radius at execution time
      Scanner sc= new Scanner(System.in);
      
      System.out.print("Enter the Radius of Circle: ");
      radius= sc.nextInt();
      
      circum = 2*radius*pi;//formula for circumference of the circle
      System.out.println("Circumference of the circle="+Math.round(+circum));
  }
}





// very good

