package ch13;

public class StrBuilderEx {
	public static void main(String[] args) {
	
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a");
		String str2 = " Java Programmer";
		str1.append(str2);
		System.out.println("---------------------------");
		System.out.println(str1);
		str1.replace(7,11,"JSP");
		System.out.println(str1);
		String str3=str1.substring(7);
		System.out.println(str3);
		System.out.println("---------------------------");
		
	}
}
