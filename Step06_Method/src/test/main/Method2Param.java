package test.main;

public class Method2Param {
	public static void main(String[] args) {
		double myHeight=174.9;
		hiEveryone(15, 55);
		hiEveryone(12, myHeight);
		byEveryone();
		
	}
	public static void hiEveryone(int age,double height) {
		System.out.println("�� ���̴�"+age+"�Դϴ�");
		System.out.println("�� �����Դ�"+height+"�Դϴ�.");
	
	}
	public static void byEveryone()
	{
		System.out.println("������ �˰ڽ��ϴ�.");
	}
}
