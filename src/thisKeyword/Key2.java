package thisKeyword;

//2) this: To Invoke Current Class Method

class A
{    
 void m()
 {
	 System.out.println("hello m");
 }    
void n()
 {    
System.out.println("hello n");    
//m();//same as this.m()    
 this.m();    
 }    
}    
class Key2
 {    
public static void main(String args[])
 {    
A a=new A();    
a.n();    
 }
}    