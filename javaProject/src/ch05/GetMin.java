package ch05;

public class GetMin {
	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int minimum;
		minimum = s[0]; //12로 초기화
		for(int i=1; i<s.length; i++) {
			if(s[i] <minimum) { //3<12, true 면
				minimum = s[i]; //minimum =3으로 변경
			}
		}
		System.out.println("최소값은 : "+minimum);
	}
}
