package curs4;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int a = 60;
		int b = 130;
		
		
		int x = a>b?a:b;
		
		System.out.println(x);
		
		
		if(a>b) {
			x = a;
		}else {
			x=b;
		}
		
		System.out.println("-----------------------");
		
		int num1 = 5;
		int num2 = 10;
		int num3 = 8;
		
		
		int y = num1>num2 ? num1 : (num2<num3?num2:num3);
		
		System.out.println(y);
	}
	

}
