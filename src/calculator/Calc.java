package calculator;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res, num1, num2;
		num1 = 10;
		num2 = 20;
		
		Calc c = new Calc(); // initialize object
		
		// call add function
		res = c.add(num1, num2);
		System.out.println("Result of Add is:" + res);
		
		// call sub function
		res = c.sub(num1, num2);
		System.out.println("Result of Sub is:" + res); 
		
		System.out.println("Good Bye !!" );

	}
	
	public  int add(int a, int b) {
		int c= a+b;
		return c;
	}
	
	public int sub (int a, int b){
		int c ;
		if (a>b) {
			c = a-b;
		}
		else{
			c= b-a;
		}
		return c;
	}
}
