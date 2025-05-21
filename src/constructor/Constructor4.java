package constructor;

/*
 Constructor Overloading:
 Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
 They are arranged in a way that each constructor performs a different task. 
 They are differentiated by the compiler on the basis of the number of parameters in the list and their types.
 */


//Java program to overload constructors    
class Student4{    
  int id;    
  String name;    
  int age;    
  //creating two arg constructor    
  Student4(int i,String n){    
  id = i;    
  name = n;    
  }    
  //creating three arg constructor    
  Student4(int i,String n,int a){    
  id = i;    
  name = n;    
  age=a;    
  }    
  //creating method to display values  
  void display(){System.out.println(id+" "+name+" "+age);}    
}  
//creating a Main class to create instance and call methods  
public class Constructor4{  
  public static void main(String args[]){    
  Student4 s1 = new Student4(111,"Karan");    
  Student4 s2 = new Student4(222,"Aryan",25);    
  s1.display();    
  s2.display();    
 }    
}    