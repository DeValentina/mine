package ch06;

//리턴 있음 <-> void
public class ReturnEx {
	public static int sum(int a) {//리턴타입 int
		int result = 0;
		for(int i=1; i<=a; i++) {
			result = result + i;
		}
		return result;
		//메소드를 호출한 곳으로 값을 반환
	}
public static void main(String[] args) {
	int n=sum(50); //메소드로 초기화 - 호출, sum 초기화
	//sum메소드 호출한 후 리턴
	System.out.println(n);
	n = sum(100); //메소드 재사용
	System.out.println(n);
	}
}
