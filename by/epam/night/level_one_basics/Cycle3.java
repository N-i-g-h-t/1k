package by.epam.night.level_one_basics;

//найти сумму квадратов первых ста чисел

public class Cycle3 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			sum = sum + (int)Math.pow(i, 2);
		}
		
		System.out.println(sum);
		
	}
	
}