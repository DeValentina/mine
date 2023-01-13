package ch09;

public class Manager extends Employee{
	private int num; //사번
	public String name; //이름
	String adress; //주소
	String email; //이메일
	protected int salary; //연봉
	private String rrn; //주민번호
	
	public void input(int num, String name, String adress,
			String email, String rrn, int salary ) {
		setNum(num);
		setName(name);
		setAdress(adress);
		setEmail(email);
		setSalary(salary);
		setRrn(rrn);
	}
		
	
		public void print() {
			System.out.println("======================");
			System.out.println("사번 : "+getNum());
			System.out.println("이름 : "+getName());
			System.out.println("주소 : "+getAdress());
			System.out.println("이메일 : "+getEmail());
			System.out.println("주민번호 : "+getRrn());
			System.out.println("연봉 : "+getSalary());
			System.out.println("보너스 : "+(getSalary()*0.3));
			System.out.println("======================");
}

}

