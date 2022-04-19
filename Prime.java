import java.util.Scanner;
class Prime  {
public static void main(String args[]){
  int n;
  int sum=0;
   System.out.println("Enter the  number");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for(int i=1;i<=n;i++){
    if(n%i==0){
      sum++;
   
  }
    }
  if(sum==2){
    System.out.println("prime number");
  }
  else{
    System.out.println("not a prime number");
  }
     
  }
  }
  
