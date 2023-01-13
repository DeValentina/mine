package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//해쉬맵 객체 생성
		List<EC> list=new ArrayList<>();//리스트 객체 생성
		
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918123468", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691123445", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160123482", 2600000));
		
	
		
		map.put("list", list);//맵에 리스트 추가 put("key", value)
		print(map);
	}
	
	static void print(Map<String, Object> map) {
		DecimalFormat df = new DecimalFormat("###,###.##");
		@SuppressWarnings("unchecked")
		ArrayList<EC> list2=(ArrayList<EC>)map.get("list");//좌:ArrayList, 우:Object
		System.out.println("------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("------------------------------------------------------------------");
		for(EC e : list2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()
			+"\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"+df.format(e.getPay()));
		}
		System.out.println("------------------------------------------------------------------");
		
	}
	

}


