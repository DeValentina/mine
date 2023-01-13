package ch07;

public class Student {

}

	public int getMoney() {
		return money;
	}
	public void	setMoney(int money) {
		this.money = money;
	}
	public int getSave() {
		
		if(point >= 4.3) {
			save = money;
		}else if(point >=4.0) {
			save = 250;
		}else if(point >=3.5) {
			save = 100;
		}
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	@override
	public StringtoString() {
		return "Student [name="+name+", major="+major+", year="+year+", num="+num+", money="+money+", save="+save+"]";
		
		
	}
	