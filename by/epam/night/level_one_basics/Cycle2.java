package by.epam.night.level_one_basics;

//��������� �������� ������� �� ������� [a, b] � ����� h

import java.io.*;

public class Cycle2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//������ ������
		String aa = reader.readLine();
		int a = Integer.parseInt(aa);
		//����� ������
		String bb = reader.readLine();
		int b = Integer.parseInt(bb);
		//���
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