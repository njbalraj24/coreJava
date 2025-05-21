package inheritance;

//Creating two interfaces  
interface Printable{    
void print();    
}    
interface Showable{    
void show();    
}    
//Creating a class that implements two interfaces  
class Computer implements Printable,Showable{    
public void print(){System.out.println("printing data...");}    
public void show(){System.out.println("showing data...");}    
}  
//Creating a Main class to create object and call methods  
public class MultipleInhrUsingInterface{  
public static void main(String args[]){    
  Computer c = new Computer();    
  c.print();    
  c.show();    
}    
} 