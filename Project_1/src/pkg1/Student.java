package pkg1;

public class Student 
{     
   public void method1()
   {
	   this.method2();
	   System.out.println("I am method1"); // will print this line
	   this.method2();  // it will call the method2 
	   this.method2();  // it will call the method2
   }
   
   public void method2()
   {
	   System.out.println("I am method2");
   }
   
   public static void main(String[] args) 
   {
	Student s=new Student();
	s.method1();   // we are calling the method1
   }
  
   
  
}
