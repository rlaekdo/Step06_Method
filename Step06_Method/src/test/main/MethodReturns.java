package test.main;
/*
 * 값을 반환하는 메소드
 */
public class MethodReturns {
	public static void main(String[] args) {
		int result=adder(4,5);
		System.out.println("4와 5의 합:"+result+"입니다.");
		System.out.println("3.5의제곱:"+square(3.5));
	}
	public static int adder(int num1,int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	
	public static double square(double num)
	{
		return num*num;
	}
}
