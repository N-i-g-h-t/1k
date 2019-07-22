package by.epam.night.level_one_basics;

//Найти max{min(a, b), min(c, d)}

public class Branching2 {
	
		public int min(int a, int b) {
			
			int s;
			if(a < b) {
				s = a;
			} else {
				s = b;
			}
			return s;
		}
			
			public int max(int d, int f) {
				
				int l;
				if(d > f) {
					l = d;
				} else {
					l = f;
				}
				return l;
			}
			
		public static void main(String[] args) {
			
			Branching2 br = new Branching2();
			
			int k = br.min(9, 6);
			int f = br.min(12, 3);
			
			System.out.println(br.max(k, f));
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	