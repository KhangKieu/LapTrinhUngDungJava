import java.util.Scanner;

public class bai2Lap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			float x,x1,x2;
			float delta;
			System.out.println("Nhập a, b, c của bạn:");
			Scanner scanner = new Scanner(System.in);
			float a= scanner.nextFloat();
			float b = scanner.nextFloat();
			float c = scanner.nextFloat();
			delta = (float) (Math.pow(b,2) - 4*a*c);
			if (a ==0)
			{
				if (b ==0)
				{
					System.out.println("Phương trình vô nghiệm.");
				}
				else
				{
				x= -b/c;
				System.out.println("Phương trình có 1 nghiệm:"+x);
				}
			
			}
			else
			{
				if(delta >0)
				{
				x1 = (float)((-b-Math.sqrt(delta))/2*a);
				x2 = (float)((-b+Math.sqrt(delta))/2*a);
				System.out.println("Phương trình có 2 nghiệm kép:\nx1:" +x1 +"\nx2:" +x2);
				}
				else if(delta ==0)
				{
					x1 = x2 = (-b/2*a);
					System.out.println("Nghiệm phương trình:" +x1);
				}
				else 
				{
					System.out.println("Phương trình vô nghiệm.");
				}
			}
		


		}
		}

	}


