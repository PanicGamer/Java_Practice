import java.util.Scanner;
class Evensumton{
  public static void main(String args[])
  {
    int n,i=1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n number");
    n=sc.nextInt();
   
   
    while(i<=n)
      {
        
        if(i%2==0){
          
         count=count+i;
          }
        
        i++;
         
    
         
       
      }
    System.out.println(count);
    }
}
