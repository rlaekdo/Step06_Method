package test.main;

public class OnlyExitReturn {
	public static void main(String[] args) {
		devide(4,2);
		devide(9,0);
	}

	
	public static void devide(int num1,int num2) {
		
		if(num2==0) {
			System.out.println("0���δ� ���� ������ �����ϴ�.");
			return; //���� ��ȯ�� ������ �޼ҵ��� ���ᵵ ���Ѵ�.
		}
		System.out.println("������ ���:"+(num1/num2));
	}
}
