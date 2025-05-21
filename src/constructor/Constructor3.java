package constructor;

/*
 Example of Default Constructor: Displays the Default Values.
 In the above class, we are not creating any constructor so compiler provides us a default constructor. 
 Here, 0 and null values are provided by default constructor.
 */

class Student
{ 
    int id;    
    String name;    
    //method to display the value of id and name    
    void display(){System.out.println(id+" "+name);}    
}  
//Main class to create objects and calling methods  
public class Constructor3
{  
    public static void main(String args[])
    {    
        //creating objects    
        Student s1=new Student();    
        Student s2=new Student();    
        //displaying values of the object    
        s1.display();    
        s2.display();    
    }    
}  