package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) 
	{
		String id1 = "", pass1 = "", id2 = "asd", pass2 = "123";
		String parayatirma = "1", paracekme = "2", bakiyesorgulama = "3", cikisyapma = "4";
		int menu;
		int bakiye = 1500, yatirilan = 0, cekilen = 0;
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("ID giriniz: ");
		id1 = scanner.next();
		System.out.print("PASS giriniz: ");
		pass1 = scanner.next();
			
			do
			{
			if(id1.equals(id2) && pass1.equals(pass2))
			{
				System.out.println("1.Para Yatirma \n2.Para Cekme \n3.Bakiye Sorgulama \n4.Cikis Yapmak");
				System.out.print("Yapmak istediginiz islemi seciniz: ");
				menu = scanner.nextInt();
				if(0 < menu && menu < 5)
				{
					switch(menu)
				{
				case 1:
					System.out.print("Yatirmak istediginiz tutari giriniz: ");
					yatirilan = scanner.nextInt();
					bakiye = bakiye + yatirilan;
					System.out.printf("%d miktar para yatirdiniz.\tBakiyeniz: %d\n",yatirilan, bakiye);
					break;
				case 2:
					System.out.print("Cekmek istediginiz tutari giriniz: ");
					cekilen = scanner.nextInt();
					if(bakiye >= cekilen)
					{
					bakiye = bakiye - cekilen;
					System.out.printf("%d miktar para cektiniz.\tKalan bakiyeniz: %d\n",cekilen,bakiye);
					}
					else 
					{
					System.out.println("\t\tBakiyenizden fazla miktarda cekme islemi denediniz. Tekrar deneyiniz.");
					}
					break;
				case 3:
					System.out.println("\t\tBakiyeniz: " + bakiye);
					break;
				case 4:
					System.out.println("Cikis yaptiniz.");
					System.exit(0);
				default:
					System.out.println("\t\tHatali islem yaptiniz.Tekrar menuye yonlendiriliyorsunuz");
					
				}
				/*switch(parayatirma.equals(menu) ? "1" : paracekme.equals(menu) ? "2" :
					bakiyesorgulama.equals(menu) ? "3" : cikisyapma.equals(menu) ? "4" : "")
				{
				case "1":
					System.out.print("Yatirmak istediginiz tutari giriniz: ");
					yatirilan = scanner.nextInt();
					kalan = bakiye + yatirilan;
					bakiye = kalan;
					System.out.printf("%d miktar para yatirdiniz.\t Bakiyeniz: %d\n",yatirilan, kalan);
					break;
				case "2":
					System.out.print("Cekmek istediginiz tutari giriniz: ");
					cekilen = scanner.nextInt();
					if(bakiye >= cekilen)
					{
					kalan = bakiye - cekilen;
					bakiye = kalan;
					System.out.printf("%d miktar para cektiniz./t Kalan bakiyeniz: %d\n",cekilen,kalan);
					}
					System.out.println("Hatali miktar giridiniz. Tekrar deneyiniz.");
					break;
				case "3":
					System.out.println("Bakiyeniz: " + bakiye);
					break;
				case "4":
					System.out.println("Cikis yaptiniz.");
					System.exit(0);
					break;
					default:
						System.out.println("Hatali islem yaptiniz.Tekrar menuye yonlendiriliyorsunuz");
						
					
				}*/
				}
				else
				{
					System.out.println("\t\tHataili menu islemi yaptiniz. Tekrar deneyiniz");
				}
				
			}
			else
			{
				
				
				for(int i = 2; i > 0; i--)
				{
					System.out.println("Hatali giris");
					System.out.printf("%d hakkiniz kaldi \n",i);
					System.out.print("ID giriniz: ");
					id1 = scanner.next();
					System.out.print("PASS giriniz: ");
					pass1 = scanner.next();
					if(id1.equals(id2) && pass1.equals(pass2))
					{		
						break;
					}
					else if(i == 1)
					{
						System.err.println("\t\tKartiniz bloke olmustur.");
						scanner.close();
						System.exit(0);
					}
				}
				
			}
			
			}while(id1.equals(id2) && pass1.equals(pass2));

	}

}
