package ch02;

public class Light {
	public static void main(String[] args) {
		//long 은 8바이트(64비트) 정수를 저장
		long lightspeed;
		long distance;
		
		lightspeed = 300000L;
		distance = lightspeed * 365L * 24 * 60 * 60;
		//빛의 속도 * 365 days * 24h * min * sec
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + " km" );
		//"문자열" + 변수 ~ : 여기서의 + 기호는 연결연산자임
	}

}
