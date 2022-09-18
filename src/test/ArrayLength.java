package test;
//import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("5개의 정수를 입력하세요");
//		int intArray[] = new int[5];
//		double sum = 0.0;
//		for (int i=0; i<intArray.length; i++)
//			intArray[i] = scanner.nextInt();
//		
//		for(int i=0; i<intArray.length; i++)
//			sum+=intArray[i];
//		
//		System.out.println("평균은 "+ sum/intArray.length);
//		scanner.close();
		int [] n = {1,2,3,4,5};
		int sum = 0;
		for(int k :n) {
			System.out.print(k+"");
			sum += k;
		}
		System.out.println("합은 "+sum);
	
	
	String f[] = {"사과","배","바나나","체리","딸기","포도"};
	for(String s:f)
		System.out.print(s+"");
	}
}
