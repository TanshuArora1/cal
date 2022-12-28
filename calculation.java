package javalearn;

class calculation {
	public static void addition (int a, int b) {
		int result = a + b;
		System.out.println("sum of numbers:"+result);
	}
	public static void subtraction (int a, int b) {
		int result = a - b;
		System.out.println("sum of numbers:"+result);
	} 
	public static void multiplication (int a, int b) {
		int result = a * b;
		System.out.println("sum of numbers:"+result);
	}

	public static void main (String[]args) {
		int a=20, b=30;
		calculation.addition(a,b);
		calculation.subtraction(a,b);
		calculation.multiplication(a,b);
	}}


