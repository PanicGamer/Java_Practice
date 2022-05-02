import java.util.Scanner;
  class Student
    {
      private int rollno;
      private String name;
    void setRollno(int rollno)
      {
        this.rollno=rollno;
      }
      int getRollno()
      {
        return this.rollno;
      }
      void setName(String name)
      {
        this.name=name;
      }
      String getName()
      {
        return this.name;
      }
    }


class Private
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student st=new Student();
      System.out.println("enter the roll no");
      st.setRollno(sc.nextInt());
      System.out.println("enter the name");
      st.setName(sc.next());
      System.out.println(st.getRollno()+st.getName());
    }
  }