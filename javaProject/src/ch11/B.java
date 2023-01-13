package ch11;

public class B implements A {
	//override 기본적으로 같이 가줘야함
	
	@Override
	public void input() {
		System.out.println("데이터 입력");
		
		
	}

	@Override
	public void print() {
		System.out.println("데이터 출력");
	}
	input 

}
