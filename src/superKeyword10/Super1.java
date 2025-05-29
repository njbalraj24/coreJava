package superKeyword10;

//1) super is used to refer immediate parent class instance variable.

class Animal
{    
    String color="white";    
}    
//Creating child class  
class Dog extends Animal
{    
    String color="black";    
    void printColor(){    
        System.out.println(color);//prints color of Dog class    
        System.out.println(super.color);//prints color of Animal class    
    }    
}    
//Creating Main class to create object and call methods  
public class Super1{    
    public static void main(String args[]){    
        Dog d=new Dog();    
        d.printColor();    
    }  
}  