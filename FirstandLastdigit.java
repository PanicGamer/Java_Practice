import java.util.Scanner;
class FirstandLastdigit {
  public static void main(String args[]){
    int n,f=0,l=0;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the digit");
      n=sc.nextInt();
        l=n%10;
    System.out.println("Last digit : "+l);
    
    while(n!=0)
      {
        f=n%10;
        n=n/10;
        
      }
 System.out.println("first digit : " +f);
        
  
}
  
}

