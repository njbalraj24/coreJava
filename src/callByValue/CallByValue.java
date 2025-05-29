/*
 CallByValue - There is only call by value in java, not call by reference.
 If we call a method passing a value, it is known as call by value.
 
 */


package callByValue;

class Operation
{  
	 int data=50;  
	  
	 void change(int data)
	 {  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[])
	 {  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}

/*
Output:before change 50 
after change 50         
*/

