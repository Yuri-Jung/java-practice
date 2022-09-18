import java.util.Scanner;
public class P88_8switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("커피 주문하세요");
		String coffee = scanner.next();
		int num = scanner.nextInt();
		
		switch(coffee) {
		case "아메리카노":
		int price = num * 2500;
		System.out.println(price+"원입니다");
		break;
		
		case "카푸치노":
	    price = num * 3000;
		System.out.println(price+"원입니다");
		break;
		
		case "에스프레소":
		price = num * 2000;
		System.out.println(price+"원입니다");
		break;
		
		case "카페라테":
		price = num * 3500;
		System.out.println(price+"원입니다");
		break;
		
		default:
			System.out.println("다시 입력해주세요");
		
		}
	}

}
