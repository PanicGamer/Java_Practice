import java.util.Scanner;
  class Divisiblebyfive {
public static void main(String args[]){
  int sum=0;
 int a[]=new int[5];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the values");
  for(int i=0;i<5;i++)
    {
      a[i]=sc.nextInt(); 
    }
   System.out.println("Divisible by five are");
  for(int i=0;i<5;i++)
    {
      if(a[i]%5==0){
         System.out.println(a[i]);
      }
    }
  }
  }