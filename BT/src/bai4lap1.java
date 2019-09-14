import java.util.Scanner;

public class bai4lap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.print("a=");
       Float a = scanner.nextFloat();
       
       System.out.print("b=");
       Float b = scanner.nextFloat();
       
       System.out.print("c=");
       Float c = scanner.nextFloat();
       
       Float Delta  = (float) Math.pow(b, 2) - 4 * a * c;
       
       if (Delta > 0) {
       
        System.out.println(" Can Delta= "+ Math.sqrt(Delta));
       }else {
    	   
    	   System.out.println("ERROR");
    	   
       }
       
      
	}

}
