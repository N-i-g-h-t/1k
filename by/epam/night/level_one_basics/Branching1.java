package by.epam.night.level_one_basics;

//углы треугольника

import java.io.*;

public class Branching1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int a1 = Integer.parseInt(a);
		String b = reader.readLine();
		int a2 = Integer.parseInt(b);
		int sum = 180 - (a1 + a2);
		
		if(a1 < 0 || a2 < 0) {
			
			System.out.println("Enter positive values");
			
		} else if (sum == 90) {
			
			System.out.println("Rectangular triangle");
			
		} else if(sum > 0) {
			
			System.out.println("Triangle exists");
			
		} else {
			
			System.out.println("Triangle doesn't exist");
			
		}
		
	}
	
}