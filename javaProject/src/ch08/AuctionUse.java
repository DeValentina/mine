package ch08;

public class AuctionUse {
	public static void main(String[] args) {
		Auction a = new Auction();
		a.setName("홍길동");
		a.setUserid("hong");
		a.setMoney(150000);

		
		a.print();
	}
}
