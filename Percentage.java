//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
   import java.util.Scanner;
//Define the main method
     public class Percentage
{
      public static void main(String args[]) 
  {
      //Declare the variables
       float a,b,c;
        //Use the scanner class to provide total_marks and maximum_marks at execution time
     Scanner sc=new Scanner(System.in);
      System.out.print("total_marks=");
       a= sc.nextFloat();//input value taken and store a
        System.out.print("maximum_marks="); 
         b= sc.nextFloat();//input value taken and store b
    //formula
    c=(float)((b/a)*100);
    System.out.println("percentage = "+c+"%"); 
 }
}





/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

