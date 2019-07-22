package by.epam.night.level_one_basics;

//вычислить значение выражения по формуле

public class Line3 {
	
	double x, y;
	
	public double calculate(double x, double y) {
		
		this.x = x;
		this.y = y;
		
		double radiansX = Math.toRadians(x);
		double radiansY = Math.toRadians(y);
		
		return ((Math.sin(radiansX) + Math.cos(radiansY)) / 		
				(Math.cos(radiansX) - Math.sin(radiansY))) * 
															(Math.tan(radiansX * radiansY));
	}
	
	public static void main(String[] args) {
		
		Line3 line = new Line3();
		
		System.out.println(line.calculate(0.0, 30.0));
	}
}