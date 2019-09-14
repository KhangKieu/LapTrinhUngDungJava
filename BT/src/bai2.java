import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chieu Dai=");
		Float chieuDai = scanner.nextFloat();
		
		System.out.print("Chieu Rong=");
		Float chieuRong = scanner.nextFloat();
		
		System.out.println("Chu vi= "+ ((chieuDai + chieuRong)*2));
		System.out.println("Dien Tich="+ (chieuDai * chieuRong));
		System.out.println("Canh nho nhat"+ Math.min(chieuDai, chieuRong));
		
		

	}

}
