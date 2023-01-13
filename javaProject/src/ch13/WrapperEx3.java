package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String st = "Hello 1234";
		char[] ch = st.toCharArray();
		System.out.println("(Character 사용)");
        for(int i=0; i<ch.length; i++) {

        if(Character.isDigit(ch[i])) 
			System.out.println(ch[i] + "는 숫자입니다.");
		if(Character.isUpperCase(ch[i])) 
			System.out.println(ch[i]+"는 대문자입니다.");			
		if(Character.isLowerCase(ch[i])) 
			System.out.println(ch[i]+"는 소문자입니다.");			
		}
		//Integer
		System.out.println("---------------------------");
		System.out.println("(Integer 사용)");
		
		Integer i = new Integer(st.substring(6));
		System.out.println("문자 "+i+"입니다.");
        System.out.println("숫자 "+Integer.toString(i)+"입니다.");
        System.out.println("숫자 "+Integer.toString(i)+" + 2 = "+(i+2)+"입니다.");

        
        }
	}
