import java.util.Scanner;
class Perfect  {
public static void main(String args[]){
  int n;
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  for(int i=1;i<n;i++){//n=6
    if(n%i==0){
      sum=sum+i;
   
  }
    }
  if(sum==n){
    System.out.println("perfect number");
  }
  else{
     System.out.println("Not perfect number");
  }
    
  }
  }
  
