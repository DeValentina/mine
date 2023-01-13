package ch20;

public class Money {
	static final String UNIT = "원";
	public int money;
	
	public Money (int money) {
		this.money = money;
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static String getUnit() {
		return UNIT;
	}
	public static void main(String[] args) {
		
	}
}
