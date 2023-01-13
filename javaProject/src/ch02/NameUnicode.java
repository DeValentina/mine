package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char aValue = '\uc774';
		char bValue = '\ub3d9';
		char cValue = '\ud76c';
		
		System.out.println("char형('\\u0041\') : " + aValue);
		System.out.println("char형('\\ub3d9\') : " + bValue);
		System.out.println("char형('\\ud76c\') : " + cValue);
	}
	
}
