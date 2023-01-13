package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		//3자리수 콤마 표시
		//1)string 활용
		int val=12340000;
		String str = String.format("%,d", val);
		System.out.println(str);
		
		//2)DecimalFormat 활용
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(12300000.323232);
		System.out.println(num);
		
		//3)NumberFOrmat 활용
		NumberFormat nf = NumberFormat.getInstance(); //new처리 안함
		//static 처리된 것은 new 하지 않고
		String num2 = nf.format(1230000.1234);
		System.out.println(num2);
		
		//getInstance(Locale.국가)
		NumberFormat nf2= NumberFormat.getInstance(Locale.ITALY);
		String num3=nf2.format(1230000.1234);
		System.out.println(num3);
		
	}
}
