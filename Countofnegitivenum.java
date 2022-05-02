import java.util.Scanner;
  class Countofnegitivenum {
public static void main(String args[]){
  int sum=0;
 int a[]=new int[10];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the values");
  for(int i=0;i<5;i++)
    {
      a[i]=sc.nextInt(); 
    }
   System.out.println("count of negative values are: ");
  for(int i=0;i<5;i++)
    {
      if(a[i]<0){
        sum++;
        
      }
    }
  System.out.println(sum);
  }
  }