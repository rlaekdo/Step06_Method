package test.main;

public class LocalVariable {
	public static void main(String[] args) {
		boolean scope=true;
		
		if(scope) {
			int num=1;
			num++;
			System.out.println(num);
		}		
		else {
				int num=2;
				System.out.println(num);
			
		}
		
		simple();
	}
		public static void simple()
		{
			
			int num=3;
			System.out.println(num);
		}
		//중괄호안에 있는 변수는 지역변수! 지역변수는 선언된 지역을 벗어나 버리면 메모리 공간에서 소멸된다.
	
}
// 변수는 자신이 속한 중괄호 내에서만 접근이 가능하다 떄문에 속한 영역이 다르면 이름이 동일할지라도 문제가 안된다.