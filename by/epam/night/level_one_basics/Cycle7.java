package by.epam.night.level_one_basics;

//вывести делители от m до n

import java.io.*;

public class Cycle7 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int m = Integer.parseInt(a);
		String b = reader.readLine();
		int n = Integer.parseInt(b);
		
		for(int i = m; i <= n; i++) {
			for(int j = 1; j < n; j++) {
				if(j == i) {
					System.out.println("");
				} else if(i % j == 0){
					System.out.println(j + " " + "делитель" + " " + i);
				
				}
			}
		}
		
	}
	
}