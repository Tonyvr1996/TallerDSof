
public class HelloAspectJDemo {

	public static void sayHello() {
	      System.out.println("Hello");
	  }
	

	public static void greeting()  {	      
	      String name = new String("John"); //JoinPoint Initialization
	      									//of object
	      sayHello(); //Joinpoint call method	      
	      System.out.print(name);
	      
	      

	  }	  
	
	
	public static void main(String[] args) {  	      
	      sayHello();	  //Joinpoint call method    
	      System.out.println("--------");	      
	      sayHello();	      //Joinpoint call method
	      System.out.println("--------");	      
	      greeting(); 	//Joinpoint call method
	  }

	/*
	public aspect HelloAspectJ {	
	    // Define a Pointcut is
	    // collection of JoinPoint call sayHello of class HelloAspectJDemo.
	    pointcut callSayHello(): call(* HelloAspectJDemo.sayHello()); 
	    before() : callSayHello() {
	        System.out.println("Before call sayHello");
	    } 
	    after() : callSayHello()  {
	        System.out.println("After call sayHello");
	    }  
	}  

	*/
	
	
}
