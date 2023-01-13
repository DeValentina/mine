package ch06;

public class RecursiveEx {
	static long fact1(int n) {
		return n==1 ? 1:n *fact1(n-1);
		//재귀호출 : 본인 스스로 부름
	}
}
//	static long fact2(int n) {
//		long result=1;
//		for(int i=1;i<=n; i++) {
//			result=result *i;
//		}
//		return result;
//	}
		
		//재귀호출 : 본인 스스로 부름
	
	public static void main(String[] args) {
		System.out.println(fact1(5)); 
		//5!=5x4x3x2x1
//		System.out.println(fact2(5));
	}
}
