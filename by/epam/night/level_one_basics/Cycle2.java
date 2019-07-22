package by.epam.night.level_one_basics;

//вычислить значение функции на отрезке [a, b] с шагом h

import java.io.*;

public class Cycle2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//начало прямой
		String aa = reader.readLine();
		int a = Integer.parseInt(aa);
		//конец прямой
		String bb = reader.readLine();
		int b = Integer.parseInt(bb);
		//шаг
		String hh = reader.readLine();
		int h = Integer.parseInt(hh);
		
		int x = a;
		int y = 0;
		
		while(x <= b) {
			if(x > 2){
				y = x;
			} else if(x <= 2) {
				y = -x;
			}
			System.out.println(y);
			x = x + h;
		}
		
	}
	
}