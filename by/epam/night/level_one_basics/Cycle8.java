package by.epam.night.level_one_basics;

//определить цифры входящие в запись двух чисел

import java.io.*;

public class Cycle8 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		String b = reader.readLine();
		
		char[] massA = new char[10];
		char[] massB = new char[10];
		
		for(int i = 0; i < a.length(); i++) {
				massA[i] = a.charAt(i);
		}
		for(int i = 0; i < b.length(); i++) {
				massB[i] = b.charAt(i);
		}
		
		for(char a1: massA){
			System.out.println(a1);
		}
		for(char b1: massB){
			System.out.println(b1);
		}
		
	}
	
}