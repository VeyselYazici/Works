package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Random;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) 
	{
		int secim;
		String mevcutid = "asd", mevcutpass = "123";
		int captcha, captchadogrulama = 0;
		String id = "", pass ="", id2 = "", pass2 = "", id3 = null, pass3 = null;
		Scanner scanner = new Scanner(System.in);
		Random random=new Random();
		 
		while(true)
		{
		System.out.print("Lutfen Giris icin: 1 veya Kayit icin: 2 giriniz: ");
		secim = scanner.nextInt();
		captcha = random.nextInt(1000);
		if(0 < secim && secim <3)
		{
			while(secim == 1)
			{	System.out.println("Giris sayfasina hosgeldiniz.");
				System.out.print("Kullanici adi giriniz:" );
				id = scanner.next();
				System.out.print("Sifreinizi giriniz:" );
				pass = scanner.next();
				System.out.println("Captcha kodunuz: " + captcha);
				System.out.print("Captcha giriniz:" );
				captchadogrulama = scanner.nextInt();	
				if((id.equals(mevcutid) && pass.equals(mevcutpass) && captcha == captchadogrulama) 
					|| (id2.equals(id3) && pass3.equals(pass2) && captcha == captchadogrulama))
				{
					System.out.print("Basariyla giris yaptiniz");
					scanner.close();
					System.exit(0);;
				}
				else
				{
				System.out.println("Yanlis giris yaptiniz tekrar deneyiniz.");	
				break;
				}
				
			}
			while(secim == 2)
			{	
				System.out.println("Kayit sayfasina hosgeldiniz.");
				System.out.print("Kullanici adi giriniz: ");
				id2 = scanner.next();
				id3 = id2;
				System.out.print("Sifre  giriniz: ");
				pass2 = scanner.next();
				pass3 = pass2;
				System.out.println("Captcha kodunuz: " + captcha);
				System.out.print("Captcha giriniz:" );
				captchadogrulama = scanner.nextInt();	
				break;
			}
			continue;
			
		}
		else
		{
		continue;
		}
	}
		

	}

}
