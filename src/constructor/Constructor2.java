package constructor;

//Java Program to demonstrate the use of the parameterized constructor.    
class Student2
{    
  int id;    
  String name;    
  //creating a parameterized constructor    
  Student2(int i,String n)
  {    
  id = i;    
  name = n;    
  }    
  //method to display the values    
  void display()
  {
	  System.out.println(id+" "+name);
  }    
}  
//Main class to create objects and class methods  
public class Constructor2{  
  public static void main(String args[]){    
  //creating objects and passing values    
  Student2 s1 = new Student2(111,"Joseph");    
  Student2 s2 = new Student2(222,"Sonoo");    
  //calling method to display the values of object    
  s1.display();    
  s2.display();    
 }    
}    