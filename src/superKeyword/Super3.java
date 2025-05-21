package superKeyword;

//3) super is used to invoke the parent class constructor

class Animal1{    
    Animal1(){System.out.println("animal is created");}    
}    
class Dog1 extends Animal1{    
    Dog1(){    
        super();  //calls the constructor of parent class  
        System.out.println("dog is created");    
    }    
}    
public class Super3{    
    public static void main(String args[]){    
        Dog1 d=new Dog1();    
    }  
}