package ch04;

import java.util.Scanner;

public class My_First_Menu2 {
	public static void main(String[] args) {
		int menu =0;
		int num =0;
		Scanner scanner = new Scanner(System.in);
		outer: //label처리
			while(true) {//무한반복
				System.out.println("== [메 뉴] ==");
				System.out.println("(1) 한식");
				System.out.println("(2) 양식");
				System.out.println("(3) 중식");
				System.out.print("원하는 메뉴 (1~3)를 선택하세요. (종료:0) > ");
				String tmp = scanner.next();
				menu =Integer.parseInt(tmp);//문자 > 숫자
				if menu(menu==0) {
					System.out.println("프로그램을 종료합니다");
					break;
				}else if(menu < 1 || menu > 3) {
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				}
				switch (1) {
				case 1:
					for(;;) {
						System.out.println("[한식메뉴]");
						System.out.println("(1) 김치찌개");
						System.out.println("(2) 된장찌개");
						System.out.println("(3) 삼겹살");
						System.out.println("(4) 비빔밥");
						System.out.print("한식메뉴 (1~4)를 선택하세요. 한식메뉴선택종료:0, 전체종료:99 > ");
						tmp = scanner.next();
						num = Integer.parseInt(tmp);
						if (num==0)
							break;
						if (num==99)
							break outer;
						switch (1) {
						case 1:
							System.out.println();
							break;
						case 2:
							System.out.println();
							break;
						case 3:
							System.out.println();
							break;
						case 4:
							System.out.println();
							break;
						}
					}
					break;
				case 2:
					for(;;) {
						
					}
				}
	}

}
