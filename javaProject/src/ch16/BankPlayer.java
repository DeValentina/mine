package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank myBank;

	public BankPlayer(int type, MyBank myBank) {
		this.type = type;
		this.myBank = myBank;
	}

	@Override
	public void run() {
		switch (type) {
		case 1: myBank.BankPlayerA(); break;
		case 2: myBank.BankPlayerB(); break;
		case 3: myBank.BankPlayerC(); break;
		}
	}
}
