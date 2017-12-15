package test.main;

public class methodDefAdd {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("메인 메소드 끝");
	}
	
	public static void hiEveryone(int age) {
		System.out.println("hiEveryone 메소드시작");
		System.out.println("제 나이는"+age+"입니다.");
		
	}
}
