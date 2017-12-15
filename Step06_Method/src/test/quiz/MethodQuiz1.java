package test.quiz;

public class MethodQuiz1 {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
			
		int num1=5;
		int num2=10;
		
		abc(50,5);
		abc(num1,num2);
		
		System.out.println("메인 메소드 종료");
	
	}
	public static void abc(int num1,int num2) {
		int result1=num1+num2;
		int result2=num1-num2;
		int result3=num1*num2;
		int result4=num1/num2;
		System.out.println("두수의 합:"+result1);
		System.out.println("두수의 차:"+result2);
		System.out.println("두수의 곱:"+result3);
		System.out.println("두수의 나눗셈:"+result4);
	}
}
