package utils;

import java.util.Scanner;

public class LerEntrada {
	
	private static Scanner scanner = new Scanner(System.in);

	public static String lerString() {
		return scanner.nextLine();
	}
	
	public static int lerInt() {
		return scanner.nextInt();
	}
	
	public static float lerFloat() {
		return scanner.nextFloat();
	}
}
