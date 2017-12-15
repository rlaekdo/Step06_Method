package test.quiz;

public class MethodQuiz3 {
	public static void main(String[] args) {
		
		double result1=one(5);
		double result2=two(5);
		System.out.println("원의 넓이는:"+result1);
		System.out.println("원의 둘레는:"+result2);
	
	}
	public static double one(double rad){
		double pi=3.14;
		return rad*rad*pi;
	}
	
	public static double two(double rad) {
		double pi=3.14;
		return rad*2*pi;
	}
}
