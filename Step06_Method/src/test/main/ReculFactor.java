package test.main;
//재귀함수
public class ReculFactor {
	 public static void main(String[] args) {
		System.out.println("3 factorial:"+factorial(3));
	}
	 
	 public static int factorial(int n) {
		 if(n==1) {
			 return 1;
		 }
		 else {
			 return n*factorial(n-1); //기존에 메소드가 완료되지 않았다해서 다른 메소드를 호출못하는것은 아니다.
		 }
	 }
}
