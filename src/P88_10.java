import java.util.Scanner;
public class P88_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("커피 주문하세요");
		
		String coffee=scanner.next();
		int num = scanner.nextInt();
		
		if(coffee.equals("에스프레소")) {
			if(num>=10){
				int price=num*1900;
				System.out.println(price+"입니다.");		
			} else {
				int price = num * 2000;
				System.out.println(price+"입니다.");		
			}
		} 
		else if(coffee.equals("아메리카노")) {
			int price = num * 2500;
			System.out.println(price+"입니다.");	
		}
		else if(coffee.equals("카푸치노")) {
			int price = num * 3000;
			System.out.println(price+"입니다.");
	}
		else if(coffee.equals("카페라테")) {
			int price = num * 3500;
			System.out.println(price+"입니다.");
		}
		scanner.close();
	}

}
