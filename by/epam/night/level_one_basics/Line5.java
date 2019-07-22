package by.epam.night.level_one_basics;

//Вывести значение в часа, минутах и секундах

import java.io.*;

public class Line5 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int n = Integer.parseInt(a);
		
		if(n >= 0 ) {
		int h = n / 3600; //время в часах
		int m = (n - 3600 * h) / 60; //время в минутах
		int s = n - (3600 * h + 60 * m); //время в секундах
		
		System.out.println(h + "ч" + " " + m + "мин" + " " + s + "с");
		
		} else {
			System.out.println("Enter positive value");
		}
	}
}