import java.util.Scanner;
class One_to_n{
  public static void main(String args[])
  {
    int n,i=1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n number");
    n=sc.nextInt();
   
   
    while(i<=n)
      {
        count=count+i;
       i++;
          
    
         
       
      }
    System.out.println(count);
    }
}
