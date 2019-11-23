package com.upcasting.example;

class a{
	public void m1(){
		System.out.println("a m1");
	}
}
class b extends a{
	public void m2(){
		System.out.println("b m2");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		/*a A= new b();//upcasting
		A.m1();
		new b().m2();//direc calling
*/
		b B=(b) new a();//down casting
		B.m1();
		B.m2();
	}
	
}
