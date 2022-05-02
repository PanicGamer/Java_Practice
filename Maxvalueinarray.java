import java.util.Scanner;
  class maxvalueinarray {
public static void main(String args[]){
 
 int a[]=new int[5];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the values");
  for(int i=0;i<5;i++)
    {
      a[i]=sc.nextInt(); 
    }
   System.out.println("the max value in the given number");
   int max=a[0];
  for(int i=0;i<5;i++)
    {
      if(a[i]>0){
        max=a[i];
      }
     
    }
   System.out.println(max);
  }
  }