//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
//Define main method
  public class Unicode 
{
    public static void main(String args[])
  {




    int a;
    //Use the scanner class to provide character at execution time
    Scanner sc = new Scanner(System.in); 
      System.out.print("Characters = ");

        a = sc.next().charAt(0);  

       System.out.println("asciiValue of the Characters = " +a);
//Print the Result

  }
}





// very goood
