package test.quiz;

public class MethodQuiz6 {
	public static void main(String[] args) {
		toBinary(5);
}
	
	public static int toBinary(int decimal)
	{
		if(decimal>0) {
			int bin;
			bin=decimal%2;
			decimal/=2;
			toBinary(decimal);
			System.out.println(bin);
			
		}
		return 0;
		
	}
}