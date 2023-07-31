package com.shashi;

class A{
	int i=10;
	void funA(){
		System.out.println("inside funA of A");
	}
}

public class Demo1
{
public A fun1(){ //return type as class A type
System.out.println("inside fun1 of Demo");
//A a1=new A();
//return a1;
return new A();
}
public static void main(String[] args)
{
Demo1 d1=new Demo1();
d1.fun1(); //here returned A class object will reaches to the GC.
//to hold the returned value we have 2 options:
//1.to the same class variable
//2.to the parent class variable
A a1= d1.fun1(); //to the same class variable
a1.funA();
Object obj = d1.fun1(); //to the parent class variable

}
}

