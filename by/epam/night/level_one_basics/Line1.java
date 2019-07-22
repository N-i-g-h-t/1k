package by.epam.night.level_one_basics;

public class Line1 {
	
	int a;
	int b;
	int c;
	
	public int searchZ(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
		return ((a - 3) * b / 2) + c;
	}
	
	public static void main(String[] args){
		
		Line1 line = new Line1();
		
		System.out.println(line.searchZ(3, 5, 7));	
	}
}