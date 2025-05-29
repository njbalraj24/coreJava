package oopsJava4;

/*
 3) Object Initialization through a Constructor
 */


class Student3 {    
    int id;    
    String name;    
    // Constructor with parameters    
    public Student3(int id, String name) {    
        this.id = id;    
        this.name = name;    
    }    
    // Method to display student information    
    public void displayInformation() {    
        System.out.println("Student ID: " + id);    
        System.out.println("Student Name: " + name);    
    }    
}    
public class Object3 {    
    public static void main(String[] args) {    
        // Creating objects of Student class with constructor    
        Student3 student1 = new Student3(1, "John Doe");    
        Student3 student2 = new Student3(2, "Jane Smith");    
        // Displaying information of the objects    
        student1.displayInformation();    
        student2.displayInformation();    
    }    
}  