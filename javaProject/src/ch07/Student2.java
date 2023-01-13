package ch07;

public class Student2 {
	//getter,setter 활용안하는 방법
	private String name;
	private String major; //전공
	private int year; //학년
	private String num; //학번
	private double point; //평점평균
	private int money; //등록금
	private int save; //장학금
	
	public void input(String name, String major, int year, String num, double point, int money) {
		this.name=name;
//		a = name; 이름이 같을땐??
	}
}
