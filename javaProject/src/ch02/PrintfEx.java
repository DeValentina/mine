package ch02;

public class PrintfEx {
	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s ="Java";
		double f = 3.14;
		
		System.out.printf("%d\n", i);
		// \n또는 %n 은 줄바꿈하는 기호이다.
		System.out.printf("%o\n", i );
		System.out.printf("%x\n", i );
		System.out.printf("%c\n", i );
		System.out.printf("%5d\n", d );
		System.out.printf("%-5d\n", d );
		System.out.printf("%05d\n", d );
		System.out.printf("%,d\n", d );//3자리마다 콤마	
		System.out.printf("%,7d\n", d );
		System.out.printf("%s\n", s );
		System.out.printf("%5s\n", s );
		System.out.printf("%-5s\n", s );
		System.out.printf("%f\n", f );
		System.out.printf("%e\n", f );
		System.out.printf("%4.1f\n", f );
		System.out.println(String.format("%4.1f", f)); 
		//printf처럼 바꾸는 작업
		System.out.printf("%.1f\n", f );//소수점 첫째까지만 알고 싶다면
		System.out.printf("%04.1f\n", f );
		System.out.printf("%-4.1f\n", f );
		
		int a = 3, b = 5;
		System.out.println("a%%b=%d\n", a%b);
		//%를 표현하고자 할때는 a%%b 처럼 % 2개씀
		
					
	}

}
