package ch14;

import java.util.Scanner;

public class Product1 {
	private String number;
	private String name;
	private String company;
	private int price;
	private int amount;
	private int money;
	private double vat;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
			System.out.print("제품번호 : ");
			number = sc.next();
			System.out.print("제품명 : ");
			name = sc.next();
			System.out.print("제조사 : ");
			company = sc.next();
			System.out.print("단가 : ");
			price = sc.nextInt();
			System.out.print("수량 : ");
			amount = sc.nextInt();
			
			money = price * amount;
			vat = (money * 0.1);
			}
				

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	public double getVat() {
		return vat;
	}


	public void setVat(double vat) {
		this.vat = vat;
	}

	
	
}
