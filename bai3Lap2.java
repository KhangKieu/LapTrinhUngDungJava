import java.util.Scanner;

public class bai3Lap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("So dien=");
       Float soDien = scanner.nextFloat();
       
       if(soDien <= 50) {
    	   Float tienDien = soDien *1000;
    	   System.out.println("Tien Dien La=" + tienDien);
    	   
       }else {
    	   Float tienDien = 50*1000 + (soDien - 50)*1200;
    	   System.out.println("Tien Dien La=" + tienDien);
       }
       
	}

}
