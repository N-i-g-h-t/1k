package by.epam.night.level_one_basics;

//вывести на экран соответствие между символами и их численными обозначениями

import java.io.*;

public class Cycle6 {
	
	public static void main (String[] args) throws IOException {
		
		boolean isSun = true;
		
		while(isSun) {
			System.out.println("Введите символ:");
			System.out.println("q - выход");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			String a = reader.readLine();
			char a1 = a.charAt(0);
			int s = (int)a1;
			System.out.println("Символу " + a1 + " соответствует число " + s);
			isSun = false;
		}
	}
	
}