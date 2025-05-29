package superKeyword10;

//2) super can be used to invoke parent class method

class Animal2{    
    void eat(){System.out.println("eating...");}    
}    
//Creating child class  
class Dog2 extends Animal2{    
    void eat(){System.out.println("eating bread...");}    
    void bark(){System.out.println("barking...");}    
    void work(){    
        super.eat();    
        bark();    
    }    
}    
//Creating Main class to create object and call methods  
public class Super2{    
    public static void main(String args[]){    
        Dog2 d2=new Dog2();    
        d2.work();    
    }  
}  