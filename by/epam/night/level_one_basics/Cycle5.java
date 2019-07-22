package by.epam.night.level_one_basics;

//найти сумму ряда начиная от e

public class Cycle5 {
	
	public static void main(String[] args) {
		
		double sum = 0;
		double e = 2.0;
		
		for(int i = 0; i < 300; i++) {
			double a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
			if(a >= e){
				sum = sum + a;
			}
		}
		
		System.out.println(sum);
		
	}
	
}