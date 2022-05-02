import java.util.Scanner;
  class Arrayinput {
public static void main(String args[]){  

Scanner sc=new Scanner(System.in);//declaration and instantiation  
  int a[]=new int[10];
//traversing array  
  System.out.println("enter the value");
for(int i=0;i<10;i++)//length is the property of array  
  {
   a[i]=sc.nextInt();
    
  }
  System.out.println(" the indexes");
  for(int i=0;i<10;i++)//length is the property of array  
  {
   System.out.println("the values stored in " +i);
    
  }
}
  }
