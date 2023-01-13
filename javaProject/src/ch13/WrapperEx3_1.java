package ch13;

public class WrapperEx3_1 {
	public static void main(String[] args) {
		String st = "Hello 1234";
		System.out.println("(Character 사용)");
        for(int i=0; i<st.length(); i++) {
	        if(Character.isDigit(st.charAt(i))) {
				System.out.println(st.charAt(i) + "는 숫자입니다.");
	        }else if(Character.isUpperCase(st.charAt(i))) {
				System.out.println(st.charAt(i)+"는 대문자입니다.");			
	        }else if(Character.isLowerCase(st.charAt(i))) {
				System.out.println(st.charAt(i)+"는 소문자입니다.");
	        }
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


