package by.epam.night.level_one_basics;

//������� �������� � ����, ������� � ��������

import java.io.*;

public class Line5 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int n = Integer.parseInt(a);
		
		if(n >= 0 ) {
		int h = n / 3600; //����� � �����
		int m = (n - 3600 * h) / 60; //����� � �������
		int s = n - (3600 * h + 60 * m); //����� � ��������
		
		System.out.println(h + "�" + " " + m + "���" + " " + s + "�");
		
		} else {
			System.out.println("Enter positive value");
		}
	}
}