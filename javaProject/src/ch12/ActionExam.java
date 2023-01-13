package ch12;

abstract class Action {
	public abstract void exec();
	
}
public class ActionExam extends Action {
	
	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	public static void main(String[] args) {
		Action a = new ActionExam() {
		//이거 자체가 class
			String name = "kim";
			@Override
			public void exec() {
				System.out.println("나는 "+name+"이다.");
			}
		}; // ;으로 마무리해줘야함! 익명클래스 끝에는 세미콜론 온다
		a.exec();
	}

}
