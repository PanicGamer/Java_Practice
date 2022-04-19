import java.util.Scanner;
class Noofdigitsno{
  public static void main (String args[]){
    int n,i=0;
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the digit");
      n=sc.nextInt();
    while(n!=0)
      {
       n=n/10;
       i++;
      }
    System.out.println(i);
  }
}