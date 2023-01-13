package ch14;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		List<Product1> list = new ArrayList<>();
		System.out.println("제품정보를 입력하세요.");

		while(true) {
			Product1 p= new Product1();
			p.input();
			list.add(p);
			System.out.println("입력 종료 : exit, 계속 진행 : 그외 모든 문자");
			String s = scan.next();
			
			if(s.equals("exit")) {
				System.out.println("입력을 종료합니다.");
				break;
				
			}
				
	
	
		}
		System.out.println("==================================================");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액(부가세포함)");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Product1 p=list.get(i);
			System.out.println(p.getNumber()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getPrice()+"\t"
			+p.getAmount()+"\t"+(p.getMoney()+p.getVat()));
		}
		System.out.println("==================================================");
	

	}
}
