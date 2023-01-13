package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		
		BankPlayer hong = new BankPlayer(1, bank);
		BankPlayer sa = new BankPlayer(2, bank);
		BankPlayer lee = new BankPlayer(3, bank);
		
		hong.start();
		sa.start();
		lee.start();
	}
}


