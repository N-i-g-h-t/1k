package by.epam.night.level_one_basics;

//��� ����� �� ������

import java.io.*;

public class Branching3 {
	
	public static void main(String[] args) throws IOException {
		
		int calc1;
		int calc2;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int x1 = Integer.parseInt(a); //���������� ����� �
		String b = reader.readLine();
		int y1 = Integer.parseInt(b);
		
		String c = reader.readLine();
		int x2 = Integer.parseInt(c); //���������� ����� B
		String d = reader.readLine();
		int y2 = Integer.parseInt(d);
		
		String e = reader.readLine();
		int x3 = Integer.parseInt(e); //���������� ����� C
		String f = reader.readLine();
		int y3 = Integer.parseInt(f);
		
		calc1 = (x1 - x3) * (y2 - y3);
		calc2 = (x2 - x3) * (y1 - y3);
		
		if(calc1 == calc2) {
			System.out.println("����� ����������� �� ����� ������");
		} else {
			System.out.println("����� �� ����������� �� ����� ������");
		}
		
	}
	
}


