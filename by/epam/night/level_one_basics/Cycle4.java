package by.epam.night.level_one_basics;

//найти произведение квадратов первых двухсот чисел

import java.math.BigInteger;

public class Cycle4 {
	
	public static void main(String[] args) {
		
		BigInteger mult = new BigInteger("1");
		double i = 0;
		while(i < 200) {
			long s = (long)(Math.pow(i, 2));
			BigInteger a = BigInteger.valueOf(s);
			
			BigInteger b = new BigInteger("1");
			BigInteger c = b.multiply(a);
			b = c;
			mult = c;
			i++;
		}
		
		 System.out.println(mult);
		
	}
	
}