package by.epam.night.level_one_basics;

//морской бой

import java.io.*;

public class Line6 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int x = Integer.parseInt(a);
		String b = reader.readLine();
		int y = Integer.parseInt(b);
		
		boolean isSun = false;
		
		if((x >= -2 && x <= 2) && (y >= 0 && y <= 4 )) {
			isSun = true;
		} else if((x >= -4 && x <= 4) && (y <= 0 && y >= -3 )) {
			isSun = true;
		}
		
		System.out.println(isSun);
		
	}
	
}