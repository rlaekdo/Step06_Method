package test.main;

public class OnlyExitReturn {
	public static void main(String[] args) {
		devide(4,2);
		devide(9,0);
	}

	
	public static void devide(int num1,int num2) {
		
		if(num2==0) {
			System.out.println("0으로는 값을 나눌수 없습니다.");
			return; //값의 반환도 되지만 메소드의 종료도 뜻한다.
		}
		System.out.println("나눗셈 결과:"+(num1/num2));
	}
}
