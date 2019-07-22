package by.epam.night.level_one_basics;

//Вычислить значение функции

import java.io.*;

public class Branching5 {
	
	public static void main(String[] args) throws IOException {
		
		double result = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		double x = Double.parseDouble(a);
		
		if(x <= 3) {
			result =Math.pow(x, 2) - (3 * x) + 9;
		} else if(x > 3) {
			result = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println(result);
		
	}
	
}