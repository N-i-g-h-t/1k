package by.epam.night.level_one_basics;

//поменять местами целую и дробную часть

import java.io.*;

public class Line4 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = reader.readLine();
		double n = Double.parseDouble(s);
		
		int a = (int)n; 
		float b = (float) a / 1000;
		float c = (float)((n - a));
		float d = (float)(c * 1000);
		float k =(float)(b + d);
		
		System.out.println(k);
		
	}
}