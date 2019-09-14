import java.util.Scanner;

public class bai4Lap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap 1 'Giai Phuong Trinh Bac 1'\nNhap 2 'Giai Phuong Trinh Bac 2'\nNhap 3 'Tinh Tien Dien'\nNhap 4 'Ban da thoat'");
		int so=0;
		Scanner Sc= new Scanner(System.in);
		so = Sc.nextInt();
			switch(so)
			{
			case 1:
			{
				System.out.println("Nhap a va b");
				float a = Sc.nextFloat();
				float b = Sc.nextFloat();
				if(a == 0)
				{
					if(b == 0)
					{
						System.out.println("Phuong Trinh Vo So Nghiem");
					}
					else
					{
					System.out.println("Phuong Trinh Vo Nghiem");
				
					}
				}
				else
				{
					float x = -b/a;
					System.out.println("Nghiem=:" +x);
				}
			break;
			}
			case 2:
			{
				float x,x1,x2;
				float delta;
				System.out.println("Nhap a, b, c");
				float a= Sc.nextFloat();
				float b = Sc.nextFloat();
				float c = Sc.nextFloat();
				delta = (float) (Math.pow(b,2) - 4*a*c);
				if (a ==0)
				{
					if (b ==0)
					{
						System.out.println("Phuong Trinh Vo Nghiem");
					}
					else
					{
					x= -b/c;
					System.out.println("Phuong Trinh Co 1 Nghiem="+x);
					}
				
				}
				else
				{
					if(delta >0)
					{
					x1 = (float)((-b-Math.sqrt(delta))/2*a);
					x2 = (float)((-b+Math.sqrt(delta))/2*a);
					System.out.println("Phuong Trinh Co 2 Nghiem Kep=\nx1:" +x1 +"\nx2:" +x2);
					}
					else if(delta ==0)
					{
						x1 = x2 = (-b/2*a);
						System.out.println("Nghiem Phuong Trinh=" +x1);
					}
					else 
					{
						System.out.println("Phuong Trinh Vo Nghiem");
					}
				}
			break;
			}
			case 3:
			{
				System.out.println("Nhap So Dien Cua Ban:");
				float soDien = Sc.nextFloat();
				if(soDien <= 50)
				{
					float tienDien = soDien * 1000;
					System.out.println("Tien Dien Cua Ban:"+tienDien);
				}
				else
				{
					float tienDien = (50*1000 + ((soDien-50)*1200));
					System.out.println("Tien Dien Cua Ban:"+tienDien);
				}
				break;
			}
			case 4:
				System.out.println("Ban Da Thoat");
				break;
				
			}

	}


	}


