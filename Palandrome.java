import java.util.Scanner;
class Palandrome {
  public static void main(String args[]){
    int n,f=0,l=0,temp;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the digit");
      n=sc.nextInt();
       temp=n;
    while(n!=0)
      {
        f=n%10;
        l=l*10+f;
        n=n/10;
        
       }
        
       if(temp==l){
     System.out.println("palandrome" +l);
         }
    else{
     System.out.println("not a palandrome " +l); 
    }
        
  
}
  
}

