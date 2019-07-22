package by.epam.night.level_one_basics;

//интимные подробности отношений кирпича и прямоугольного отверстия

import java.io.*;

public class Branching4 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//задание размеров отверстия
		String aa = reader.readLine();
		int a = Integer.parseInt(aa);
		String bb = reader.readLine();
		int b = Integer.parseInt(bb);
		
		//задание размеров кирпича
		String xx = reader.readLine();
		int x = Integer.parseInt(xx);
		String yy = reader.readLine();
		int y = Integer.parseInt(yy);
		String zz = reader.readLine();
		int z = Integer.parseInt(zz); 
		
		double gip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double xy = (double)(x + y);
		double xz = (double)(x + z);
		double zy = (double)(z + y);
		
		boolean isEnter = false;
		
		while(!isEnter) {
		if((z < b && x < a) || (z < a && x < b)) {
				isEnter = true;
			} else if((z < b && y < a) || (z < a && y < b)) {
				isEnter = true;
			} else if((x < b && y < a) || (x < a && y < b)) {
				isEnter = true;
			} else if(gip > xy || gip > xz || gip > zy) {
				isEnter = true;
			}
			break;
		}
		
		if(isEnter == true) {
			System.out.println("Кирпич проходит в отверстие");
		} else {
			System.out.println("Кирпич не проходит в отверстие");
		}
		
	}
	
}