package test.main;
//����Լ�
public class ReculFactor {
	 public static void main(String[] args) {
		System.out.println("3 factorial:"+factorial(3));
	}
	 
	 public static int factorial(int n) {
		 if(n==1) {
			 return 1;
		 }
		 else {
			 return n*factorial(n-1); //������ �޼ҵ尡 �Ϸ���� �ʾҴ��ؼ� �ٸ� �޼ҵ带 ȣ����ϴ°��� �ƴϴ�.
		 }
	 }
}
