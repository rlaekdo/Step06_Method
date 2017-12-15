package test.main;

public class Method2Param {
	public static void main(String[] args) {
		double myHeight=174.9;
		hiEveryone(15, 55);
		hiEveryone(12, myHeight);
		byEveryone();
		
	}
	public static void hiEveryone(int age,double height) {
		System.out.println("제 나이는"+age+"입니다");
		System.out.println("제 몸무게는"+height+"입니다.");
	
	}
	public static void byEveryone()
	{
		System.out.println("다음에 뵙겠습니다.");
	}
}
