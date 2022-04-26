package com.bilgeadam.boost.homework.veyselyazici;

import java.util.Scanner;

public class GradeLevel 
{
	public static void main(String[] args)
	{
		int vize1, vize2, finalnote;
		double grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Enter your visa note:");
		vize1 = scanner.nextInt();
		System.out.println("2. Enter your visa note:");
		vize2 = scanner.nextInt();
		System.out.println("Enter your final note:");
		finalnote = scanner.nextInt();
		scanner.close();
		grade = ((((vize1 + vize2) / 2) * 0.4) + finalnote * 0.6);
		
		switch ((0 <= grade && grade < 50) ? "0:50" : (50 <= grade && grade < 60) ? "50:60" : (60 <= grade && grade < 70)
				? "60:70" : (70 <= grade && grade < 80) ? "70:80" : (80 <= grade && grade <= 100) ? "80:100" : "") 
		{
		case "0:50":
			System.out.println("FF: " + grade);
			break;
		case "50:60":
			System.out.println("DD: " + grade);
			break;
		case "60:70":
			System.out.println("CC: " + grade);
			break;
		case "70:80":
			System.out.println("BB: " + grade);
			break;
		case "80:100":
			System.out.println("AA: " + grade);
			break;
		default:
			System.out.println("HATA");
		
		}
				
		// II.YOL IF-ELSE
//		if(grade >= 0 && grade <= 100)
//		{
//			if(0 <= grade && grade < 50)
//			{
//				System.out.print("FF: " + grade);
//			}
//			else if (50 <= grade && grade < 60)
//			{
//				System.out.print("DD: " + grade);
//			}
//			else if(60 <= grade && grade < 70)
//			{
//				System.out.print("CC: " + grade);
//			}
//			else if(70 <= grade && grade < 80)
//			{
//				System.out.print("BB: " + grade);
//			}
//			else if(80 <= grade && grade <= 100)
//			{
//				System.out.print("AA: " + grade);
//			}
//		}
//		else
//		{
//			System.out.println("HATA");	
//		}
		
	
	}

}
