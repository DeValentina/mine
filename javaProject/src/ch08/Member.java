package ch08;

public class Member {
	private String name;//이름
	private String userid;//아이디
	private int money;//구매금액
	private String grade;//등급

	
	public Member(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;	
		
	
	
	if(money >= 100000) {
		grade="gold";
	}else {
		grade="silver";
	}
	
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money +"\t"+grade);
	}
}

