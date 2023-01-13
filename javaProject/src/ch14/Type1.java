package ch14;

public class Type1 {
	private double value;
	private String value2;
	
	public double getValue() {
		return value;//getter
	}
	public void setValue(double value) {//지역 = 멤버일때는
		this.value = value;
		
	}//위까지 non static 
	public static void main(String[] args) {
		Type1 t = new Type1 ();//객체 생성
		t.setValue(100.5);
		System.out.println(t.getValue());
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
}
