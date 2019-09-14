import java.util.Scanner;

public class bai1Lap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a=");
		Float soA = scanner.nextFloat();
		
		System.out.print("b=");
		Float soB = scanner.nextFloat();
		
		if(soA==0) {
			if(soB==0) {
			    System.out.println("Vo So Nghiem");
			}
			else {
				System.out.println("Vo Nghiem");
			}
		}
		else {
			System.out.println("Nghiem x="+ - soB / soA);
			
		}
		

	}

}
