package test.quiz;

public class MethodQuiz1 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ����");
			
		int num1=5;
		int num2=10;
		
		abc(50,5);
		abc(num1,num2);
		
		System.out.println("���� �޼ҵ� ����");
	
	}
	public static void abc(int num1,int num2) {
		int result1=num1+num2;
		int result2=num1-num2;
		int result3=num1*num2;
		int result4=num1/num2;
		System.out.println("�μ��� ��:"+result1);
		System.out.println("�μ��� ��:"+result2);
		System.out.println("�μ��� ��:"+result3);
		System.out.println("�μ��� ������:"+result4);
	}
}
