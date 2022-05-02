// sum of even number in a given numbers using array 
import java.util.Scanner;
// intiazalllation of the scanner
  class sumofevenarr {//taking class for the sum
public static void main(String args[]){
  int sum=0;
 int a[]=new int[10];// intialize a variables with size of 10
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the values");//print the output
  for(int i=0;i<10;i++)//using for loop
    {
      a[i]=sc.nextInt(); //in the size 0 to 10 the given varible store in the memory allocated
    }
  //so the given values stored in the array now
   System.out.println("sum of even values are: ");
  for(int i=0;i<10;i++)//using again the for loop we bring the given values
    {
      if(a[i]%2==0){//using if loop
        // given value divided by 2 //example 24%2 we get remainder 0
        sum = sum+a[i]; //by declaring sum=0 we can the store vlaue which is %2and equal to 0
        //sum value update in the for loop using the above condition
      }
    }
  //sum vlaue will added 
  System.out.println(sum);
  }
  }