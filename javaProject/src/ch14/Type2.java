package ch14;

public class Type2 {
	private Object value;
//	public Object

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
		t.setValue(10);
		System.out.println(t.getValue());
		t.setValue(100.5);
		System.out.println(t.getValue());
		//이처럼 object로 모든걸 처리하게 되면 내부적으로 형변환 등의 처리할게 많음
		//용량 큼
	}
}
