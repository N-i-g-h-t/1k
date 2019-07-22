package by.epam.night.level_one_basics;

//вычислить значение выражения по формуле

public class Line2{
	
	int a, b, c;
	
	public double calculate(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
		return (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a) - ((Math.pow(a, 3) * c) + Math.pow(b, -2));
		
	}
	
	public static void main(String[] args){
		
		Line2 line = new Line2();
		
		System.out.println(line.calculate(3, 5, 7));
	}
}