import java.util.Scanner;
public class P88_8 {

	public static void main(String[] args) {
		System.out.println("커피를 주문하세요");
		Scanner scanner = new Scanner(System.in);
		String menu = scanner.next();
		int num = scanner.nextInt();
		
		if(menu.equals("에스프레소")) {
			int price = num * 2000;
			System.out.println(price+"원입니다");
		}
		else if(menu.equals("아메리카노")) {
			int price = num *2500;
			System.out.println(price+"원입니다");
		}
		else if(menu.equals("카푸치노")) {
			int price = num *3000;
			System.out.println(price+"원입니다");
		}
		else if(menu.equals("카페라테")) {
			int price = num *3500;
			System.out.println(price+"원입니다");
		}
		
	
		
		scanner.close();
	}

}
