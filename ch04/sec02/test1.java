package ch04.sec02;

public class test1 {

	public static void main(String[] args) {
	for(int k=0;k<2;k++) {
		for(int j=1; j<=9 ; j++) {
			for(int i=2+(k*4); i<=5+(k*4); i++) {
				System.out.print(i+" x "+j+" = "+ String.format("%2d", i*j) + "   ");
				//System.out.printf("%d x %d = %2d  ",i,j,i*j);
	}
			System.out.println();
		}
		System.out.println();
	}
}
		
		
	
	}


