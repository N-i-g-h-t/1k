package by.epam.night.level_one_basics;

//�������� �������� ������������ ����� �� 1 �� ��������� ������������� ��������

import java.io.*;

public class Cycle1{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine();
		int x = Integer.parseInt(a);
		
		int i = 1;
		int sum = 0;
		
		while(i <= x) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
	}
	
}