package ch11;

public class StudentUse {
	public static void main(String[] args){
		SInfo s = new SInfo();
		s.address("홍길동", "서울 강남구", "hong@gmail.com");
		s.point(90, 85, 79);
		s.print();
	}
}
