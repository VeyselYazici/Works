package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) 
	{
		

	}
	public static void adim1()
	{
		Random random = new Random();
		int pc = random.nextInt(3);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bilgisayar secimi: " + pc);
	
		System.out.print("0-TAS\n1-KAGIT\n2-MAKAS\nSecim yapmak icin 0-1-2 bir tanesini giriniz:");
		int choice = scanner.nextInt();
	}

}
