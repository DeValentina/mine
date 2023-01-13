package ch11;

public class SInfo implements Student {
	int tot;
	int eng;
	int kor;
	int mat;
	double avg;
	String name;
	String addr;
	String email;
	

	@Override
	public void address(String name,String addr,String email) {
		this.name=name;
		this.addr=addr;
		this.email=email;
	}

	@Override
	public void point(int kor, int eng, int mat) {
		tot=kor+eng+mat;
		avg=tot/3.0;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
	}
	public void print() {
		System.out.println("==============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+addr+"\t"+email);
		System.out.println("-----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.println("==============================================");
	}
	
}
