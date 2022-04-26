package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Scanner;

public class Price 
{
	public static void main(String[] args) 
	{
		double kdvsiz, satis,hamfiyat;
		int kdv, kar;

		Scanner x = new Scanner(System.in);
		
		System.out.print("Satis fiyati gir: ");
		satis = x.nextInt();
		
		System.out.print("KDV gir: ");
		kdv = x.nextInt();
		
		System.out.print("Kar gir: ");
		kar = x.nextInt();
		
		kdvsiz = ((satis * 100) / (100 + kdv));
		hamfiyat = ((kdvsiz * 100) / (100 + kar));
		
		System.out.println("Ham fiyat: " + hamfiyat);
		x.close();
		
		
		
		
		
	}

}
