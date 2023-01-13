package ch05;

public class GetMinMax {
	public static void main(String[] args) {
		int data[] = {79, 88, 91, 33, 100, 55, 95};
		int minimum,maximum;
		minimum = data[0];
		maximum = data[0];
		for(int i=1; i<data.length; i++) {
			if(data[i] <minimum) {
				minimum = data[i];
			}
		}for(int i=1; i<data.length; i++) {
			if(data[i] > maximum) {
				maximum = data[i]; 
			}
		}
	System.out.println("최소값은 : "+minimum);
	System.out.println("최소값은 : "+maximum);	
	}
}
