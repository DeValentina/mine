package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum 배열보다 간편한 방식으로 나열해서 쓰기만 하면 됨
	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String name [] = {"사과", "배", "바나나","체리","딸기","포도"};
		int sum =0;
		
		for (int k:n) {
			System.out.println(k+" ");
			sum+=k;
		}
		System.out.println("합은 : "+ sum);
		
		for(String s : names ) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {//집합변수라는 객체. values()
			System.out.println(day +"요일");
			
		}
	}
}
