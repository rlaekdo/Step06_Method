package test.quiz;

public class MethodQuiz5 {
	public static void main(String[] args) {
		
		int a=number(4);
		System.out.println(a);
		

	}
	
	public static int number(int num) {
		
		if(num==0) return 1;
		
		return 2*number(num-1);
	}
}
