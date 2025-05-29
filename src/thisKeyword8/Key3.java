package thisKeyword8;

class A1
 {    
 A1()
 {
	 System.out.println("hello a");
 }    
A1(int x)
 {    
this();    
 System.out.println(x);    
 }    
}    
public class Key3
{    
public static void main(String args[]){    
A1 a=new A1(10);    
}
}    
