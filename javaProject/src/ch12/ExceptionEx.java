package ch12;

public class ExceptionEx {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		try {
			for(int i=0; i<=5; i++) {//i<=5에러지만 문법적 오류 아님
			System.out.println(nums[i]);
			}//문제 생길만한 경우를 잡아주는 것
			
		}catch(Exception e) {
			System.out.println("프로그램 실행 중에 문제가 발생했습니다.");
		}
		System.out.println("프로그램 종료...");
	}
}
