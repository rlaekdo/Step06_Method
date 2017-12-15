package test.quiz;

public class MethodQuiz2 {
	public static void main(String[] args) {
		System.out.println("메인메소드시작");
		ab(6,2);
		ab(2,6);
		System.out.println("메인메소드종료");
	}
	public static void ab(int num1,int num2) {
		
		
		if(num1>num2) {
			System.out.println(num1-num2);
		}else {
			System.out.println(num2-num1);
		}
	}
}
