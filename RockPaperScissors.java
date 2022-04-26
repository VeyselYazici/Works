package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{	
		
		int oyuncuScore = 0, bilgisayarScore = 0;
		
		while(true)
		{
			Random random = new Random();
			int pc = random.nextInt(3);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bilgisayar secimi: " + pc);
		
			System.out.print("0-TAS\n1-KAGIT\n2-MAKAS\nSecim yapmak icin 0-1-2 bir tanesini giriniz:");
			int choice = scanner.nextInt();
			if( 0 <= choice && choice <= 2)
			{
				if(!(bilgisayarScore == 5 || oyuncuScore == 5))
				{
					if((pc == 0 && choice == 1) || (pc == 1 && choice == 2) ||(pc == 2 && choice == 0))
					{
						System.out.println("\tBilgisayar: " + bilgisayarScore +"\tSiz: " + ++oyuncuScore);
				
					}
					else if((pc == 0 && choice == 0) || (pc == 1 && choice == 1) ||(pc == 2 && choice == 2))
					{
						System.out.println("\tBerabere");
						System.out.println("\tBilgisayar: " + bilgisayarScore +"\tSiz: " + oyuncuScore);
					}
					else
					{
						System.out.println("\tBilgisayar: " + ++bilgisayarScore +"\tSiz: " + oyuncuScore);
					}
				}
			}
			else
			{
				System.out.println("Hatali secim yaptiniz.\t Devam icin 1 - Cikmak icin 99 giriniz: ");
				choice = scanner.nextInt();
				if(choice == 99)
				{
					System.out.println("Cikis yaptiniz: ");
					System.exit(0);
				}
				else
				{
					System.out.println("Devam ediyosunuz");
					continue;
				}
			}
			
			if(bilgisayarScore == 5)
			{
				System.out.printf("\tOyun bitti\n\tKazanan Bilgisayar");
				scanner.close();
				System.exit(0);
			}
			else if(oyuncuScore == 5)
			{
				System.out.printf("\tOyun bitti\n\tKazanan: Oyuncu ");
				scanner.close();
				System.exit(0);
			}
				
				
			}
			
		}
		

	}


