package calculator;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res, num1, num2;
		num1 = 10;
		num2 = 20;
		
		Calc c = new Calc();
		res = c.add(num1, num2);
		System.out.println("Result of Add is:" + res);
		 

	}
	
	public  int add(int a, int b) {
		int c= a+b;
		return c;
	}
	

}
