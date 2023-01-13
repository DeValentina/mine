package ch02;

/**
 * 첫 번째 예제 프로그램
 * @version 1.0 2022-12-13
 * @author user2
 */
public class HelloExam {
  public static int sum(int n, int m) {//메소드 n=20, m=10
	  return n + m;
  }
  // 프로그램의 시작은 메인메소드부터
  public static void main(String[] args) {//메인메소드
	  int i =20;//변수 초기화(할당)
	  int s;//선언만
	  char a;//변수선언만
	  
	  s = sum(i,10);
	  a = '?';
	  System.out.println(a);
	  System.out.println("Hello");
	  System.out.println(s);
	 
  }
}
