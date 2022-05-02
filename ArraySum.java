/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
  import java.util.Scanner;
   public class ArraySum
  {
  public static void main(String args[])
    {
    
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];// array given with size of 10 to store 10 random givenvalues
    int sum=0;
//sum value is taken as 0 
    System.out.println("Enter the 10  elements:");
     for(int i=0;i<10;i++)//for loop used to store the given values in a stored array
     {
     a[i]=sc.nextInt();
    
      }
      for(int i=0;i<=10;i++){
      sum=sum+i;
      }
     System.out.println("Sum of array elements is : " +sum);
  }
}





// very goood
