//****************pizza for inheritance by subbu*******************
/*class Pizza {
   // Fields
   public String addOns = "Cheese";
   public String bread = "WheatBread";
   public String sauces[] = { "tomato", "chilli" };
 
   public void baking() {
      System.out.println("Bread baked directly inside oven");
   }
 
   public void packing() {
      System.out.println("Inside a cardboard carton!");
   }
}
 
class BurgerPizza extends Pizza {
   // Fields
   public String patty = "veg";
   public String fillings = "lettuce";
 
   @Override
   public void baking() {
      System.out.println("Patty baked inside oven");
   }
}
 
public class Practice {
   public static void main(String[] args) {
      System.out.println("PIZZA");
      Pizza vegSupreme = new Pizza();
      System.out.println(vegSupreme.addOns);
      System.out.println(vegSupreme.sauces[0]);
      System.out.println(vegSupreme.sauces[1]);
      vegSupreme.baking();
      vegSupreme.packing();
 
      System.out.println("BURGERPIZZA");
      BurgerPizza vegBurgerPizza = new BurgerPizza();
      System.out.println(vegBurgerPizza.addOns);
      System.out.println(vegBurgerPizza.sauces[0]);
      System.out.println(vegBurgerPizza.sauces[1]);
      System.out.println(vegBurgerPizza.patty);
      System.out.println(vegBurgerPizza.fillings);
      vegBurgerPizza.baking();
      vegBurgerPizza.packing();
   }
}*/




//*************datatypes*********************
/*class Practice
{
 public static void main(String[] args) {
 	System.out.println("--DATA TYPES---");
	int a=10;
	char c='B';
	String b="dharanidhar";
	float f=2.24f;
	double d=3.222545454646545464654465d;
	boolean value=true;
 	System.out.println(a);
    System.out.println(c);
    System.out.println(b);
    System.out.println(f);
    System.out.println(d);
    System.out.println(value);
   }
} */

/*class ParentClass
{
	public void displayMethod(String msg){
		System.out.println(msg);
	}
}
class Practice extends ParentClass
{
	@Override
	public void displayMethod(String msg){
		System.out.println("Message is: "+ msg);
	}
	public static void main(String args[]){
		Practice obj = new Practice();
		obj.displayMethod("Hey!!");
	}
}*/

//****************** polymorphism by subbu*************
/*public class Practice {
   //  public static void main(String[] args)  will be detailed later.
   public static void main(String[] args) {
      boolean powerAvailable = false;

      Laptop dell = new Laptop();

      if (powerAvailable) {
         System.out.println("Power is available");
         dell.power("laptop adapter");
      }
      if (!powerAvailable) {
         System.out.println("Power is unavailable");
         dell.power();
      }
   }
}

class Laptop {
   // Polymorphism using function overloading.
   // function overloading is two functions with the same name
   // but different arguments.
   // By default laptop runs on battery power.
   // zero arguments
   public void power() {
      System.out.println("Running by default on battery!");
   }

   // one argument
   // Runs on UPS power when using the adapter.
   public void power(String adapter) {
      System.out.println("Running by power from UPS using " + adapter);
   }
}*/



//*********************dynamic Binding**********************
/*class Person {
  public static void getName() {
    System.out.println("Person Name**");
  }
}
class Employee extends Person {
  public static void getName() {
    System.out.println("**Employee Name");
  }
}
public class Practice{
  public static void main(String[] args) {
   Person p1 = new Employee(); //no erros but access only person
    //Person p2 = new Person();  // only person print

   //Employee e1= new Employee(); //only emp print
   // Employee e2= new Person(); //error
    
    
   p1.getName();
    p1.getName();
    //p2.getName();  //
  //  p2.getName();
  
   //e1.getName();
    
  //  e2.getName();
  //  e2.getName();


  }
}*/

//*****************subbu dynamic binding********************
/*public class Practice{
   public static void main(String[] args) {
      // createSolarLight();
      createSolarLightDynamicPolymorphism();
   }

   private static void createSolarLightDynamicPolymorphism() {
      // SIMPLE WAY OF CREATING OBJECTS
      // Creating the reference
      SolarLight solarLightObject = null;
      // creating the instance (object)
      // the solarLightObject is dynamically attached to an instance of Sun.
      //SolarLight solarLightObject=new Sun();
      solarLightObject = new Sun();
      String lighting = solarLightObject.ligthing();
      System.out.println(lighting);
      System.out.println(solarLightObject.heating());
      System.out.println(solarLightObject.energy());
   }


   private static void createSolarLight() {
      // SIMPLE WAY OF CREATING OBJECTS
      // Creating the reference
      SolarLight solarLightObject = null;
      // creating the instance (object)
      solarLightObject = new SolarLight();
      //SolarLight solarLightObject=new SolarLight();

      String lighting = solarLightObject.ligthing();
      System.out.println(lighting);
      System.out.println(solarLightObject.heating());
      System.out.println(solarLightObject.energy());
      // ERRORS
      // solarLightObject.gases();
      // solarLightObject.rays();
      // Sun sun = new SolarLight();
   }
   
}

class SolarLight {
   String ligthing() {
      return "light till 300 mts";
   }

   String heating() {
      return "heat till 50 mts";
   }

   public String energy() {
      return "traditional energy";
   }
}

class Sun extends SolarLight {
   // overriding the base class method
   public String energy() {
      return "solar energy";
   }

   public String[] gasses() {
      String gases[] = { "Carbon dioxide (CO2)", "Methane (CH4 )" };

      return gases;

   }

   public String rays() {
      String rays = "infrared ,ultraviolet rays";
      return rays;
   }
}*/
//static variable by subbu***************************************
/*public class Practice {
   public static void main (String[] args) {
       Mobile mobile1 = new Mobile () ;
       mobile1. owner = "Rupa";

       mobile1. display ();
       Mobile mobile2 = new Mobile( );
       mobile2. owner = "Vikalp";
       mobile2. display( );
       mobile1.display();
       mobile2. display( );
       mobile1.display();
       
    }
}
class Mobile {
// Class variable are called static variable
// directly declared inside the class
// only one copy for each class
// all instances will share the same copy.
      int x=10;
      static String owner;
     void display ( ){
       x=20;
        System.out.println("x value is"+this.x);
         System.out.println (owner);
            }
}*/
//super keyword practice************************************
/*public class Practice
{
	public static void main(String[] args) {
		System.out.println("main statement");
			Name.newt();
		Name n=new Name();
		//n.neww();
	
	}
}
class Name
{
	static {
		System.out.println(" static statement");
	}
	 static void newt()
	{
		int m=55;
		System.out.println(m);
	}
}*/
//final variable program***************************
/*
class Practice{
 final int val;
 Practice()
 {
 	val=60;

 }
 void method() {

  System.out.println(val);
 }
 public static void main(String args[]) {
   Practice S1 = new  Practice();
  S1.method();
 }
}*/
/*
public class Practice{
   // You can overload the main method.
   public static void main(String[] args) {
      System.out.println("JVM looks for this method signature as an entry point");
      System.out.println("******************");
      // main();
      // int array[] = { 1, 2 };
      // main(array);
   }

   public static void main() {
      System.out.println("Custom main() method");
   }

   public static void main(int[] args) {
      System.out.println("JVM does not look for this method signature as an entry point");
      System.out.println(args[0]);
      System.out.println(args[1]);
   }
}
*/
//Main() overloading**************************************
// public class Practice{
   
//     public static void main(int[] arg5) {
//         int x=10;    
//         System.out.println(x);
//     }
//     public static void main(String[] arg3) {
//         System.out.println("main(String[] args)");
//     }
//     public static void main(char[] arg4) {
//         System.out.println('c');
//     }

//     public static void main(String arg1, String arg2) {
//         System.out.println("main(String arg1, String arg2)");
//     }
     
// }

/*public static void main(String[] args) {

int i = 100;
int res;
int result = 0;
int[] a={2,3,4};
//System.out.println(i/result);

System.out.println("divding by zero");
	// try {
	// 	 result = i / 0;
	// 	 System.out.println(result);

	 	 
	// //	 System.out.println(a[4]);
	 
	      
	// } 
try{
 	    	 result = i / 0;
 	  System.out.println(result);	
 }catch (Exception e) {
	e.printStackTrace();
System.out.println("MARKER : " + e.getMessage( ));
}}}
//  catch (Exception e1) {
//  System.out.println("MARKER : " + e1.getMessage( ));
// System.out.println("MARKER : " + e2. getMessage( ));
//  }}}
// try{
// 	    	 result = i / 0;
// 	  System.out.println(result);	
// }
// //  catch (Exception e1) {
// // System.out.println("MARKER2 : " + e1. getMessage( ));
// // }
// System.out.println("Marker");
// System.out.println(result);
*/
//subbu exception*******************************************
/*public class Practice {
   public static void main(String[] args) {
      // multipeTry();
      // multipeExceptionsInSingleTry();
   	 //multipeExceptionsInSingleTry1();
       multipeExceptionsInSingleTry2();
      //handleAllExceptions();
   }

   private static void multipeTry() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);

      // Test test = new Test();
      // System.out.println(test.value);
      try {
         Test test = null;
       //  Test test= new Test();
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      }
      try {
         int i = 200;
         int result = i / 0;
         System.out.println(result);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
      } catch (NullPointerException e) {
      	System.out.println("multipeExceptionsInSingleTry");
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry1() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
      	 System.out.println("multipeExceptionsInSingleTry1");
        
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void multipeExceptionsInSingleTry2() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
         System.out.println(e);
      }
      // catch (ArithmeticException e) {
      // System.out.println("Arithmetic problem");
      // }
      System.out.println("Program resumes normal execution!");
      System.out.println("COMPLETE");
   }

   private static void handleAllExceptions() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int num[] = { 10, 20 };
         System.out.println(num[0]);
         System.out.println(num[1]);
         System.out.println(num[2]);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (NullPointerException e) {
         System.out.println("Test instance not created");
         System.out.println(e.getMessage());
      } catch (ArithmeticException e) {
         System.out.println("Arithmetic problem");
      } catch (Exception e) {
         System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
      }
      System.out.println("COMPLETE");
   }
   private static void specificToGeneric() {
      // Local variable
      // Test test;
      // The local variable test may not have been initialized
      // System.out.println(test.value);
      // Test test = new Test();
      // System.out.println(test.value);
      try {
         int num[] = { 10, 20 };
         System.out.println(num[0]);
         System.out.println(num[1]);
         System.out.println(num[2]);
         int i = 200;
         // ArithmeticException
         int result = i / 0;
         System.out.println(result);
         Test test = null;
         // NullPointerException
         System.out.println(test.value);
      } catch (Exception e) {
         System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
      // } catch (NullPointerException e) {
      //    System.out.println("Test instance not created");
      //    System.out.println(e.getMessage());
      // } catch (ArithmeticException e) {
      //    System.out.println("Arithmetic problem");
      // }
      System.out.println("COMPLETE");
   }
}
}
class Test {
   int value = 10;
}*/

//list******************************************
import java.util.*;
class Practice
{
	public static void main(String[] args) {
		ArrayList cart=new ArrayList();
		cart.add("java");
		cart.add("c");
		cart.add("c++");
		cart.add("python");
		cart.remove();
		System.out.println(cart);
	}
}