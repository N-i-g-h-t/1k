package by.epam.night.level_one_basics;

//������� �� ����� ������������ ����� ��������� � �� ���������� �������������

import java.io.*;

public class Cycle6 {
	
	public static void main (String[] args) throws IOException {
		
		boolean isSun = true;
		
		while(isSun) {
			System.out.println("������� ������:");
			System.out.println("q - �����");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			String a = reader.readLine();
			char a1 = a.charAt(0);
			int s = (int)a1;
			System.out.println("������� " + a1 + " ������������� ����� " + s);
			isSun = false;
		}
	}
	
}