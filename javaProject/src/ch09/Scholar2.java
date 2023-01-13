package ch09;

public class Scholar2 extends Student2 {
	
	private String category;//장학금 종류 1종
	private int money;//장학금액 250만
	public void input(String name,String num, String major,int year,
			String category, int money) {
		super.input(name, num, major, year);//부모쪽 input메소드 호출
		this.category = category;
		this.money = money;
		
	}
	public void print1() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
	}
}
