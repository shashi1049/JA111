package com.shashi;

public class Demo {
	
	int fun1(){
		System.out.println("inside fun1 of Demo");
		//return 100;
		//int x=200;
		//return x;
		//we can return any value which is compatible with the int type(smaller than int)
		byte b=10;
		return b;
		//long x=20;
		//return x; //Error
		//return (int)x; //OK
		}
		public static void main(String[] args)
		{
		Demo d1=new Demo();
		d1.fun1(); //here method will be called but returned value will be unreferenced
		// hence, it will reaches to the garbage collector
		//to utilize the returned value, we need to hold that value inside a variable
		//the variable on which we hold that value should be either of the same type or bigger
		// than the specified type.
		int x=d1.fun1();
		System.out.println("Returned value is "+x);
		long y=d1.fun1(); //implicit typecasting
		System.out.println("Returned value is "+x);
		//byte b= d1.fun1(); // Error
		byte b = (byte)d1.fun1(); //explicit type casting
		}

}
