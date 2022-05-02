//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
    

   import java.util.Scanner; 
     class MobileNumber
{
      public static void main(String args[])
  {

 //Define the main method
  long m;
//Use the scanner class to provide mobileNum at execution time  
  Scanner sc = new Scanner(System.in);
  System.out.print("mobileNum=");
m = sc.nextLong();
//Declare the variable

//Verify if the mobile number is equal to 10 digits or not
    
    if((m+ "").length()==10)
    {
      //If the mobile number is equal to 10 digits then extract the last 4 digits 
    System.out.print("Your friend's mobile number ends with ******"+m%10000); 
    }
    // else print error message
    else
    {
    System.out.print("not a vaild digit"); 
    }
    
 }
}




/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter phone number (10 digits)");
mobileNum = scanner.nextLine();
*/



//Print the result
//


// very goood

