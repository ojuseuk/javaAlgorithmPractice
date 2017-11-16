/**
 * 순열
 *
 */
public class Permutation {
	public static void main(String[] args) {
		int[] p = { 0, 1, 2, 3 };
		int[] b = new int[4];
		
		// System.out.println(p[0] + p[1] + p[2] + p[3]);
		// System.out.println(p[0] + p[1] + p[3] + p[2]);
		// System.out.println(p[0] + p[2] + p[1] + p[3]);
		// System.out.println(p[0] + p[2] + p[3] + p[1]);
		// System.out.println(p[0] + p[3] + p[1] + p[2]);
		// System.out.println(p[0] + p[3] + p[2] + p[1]);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (i==j) continue;
				for (int k = 0; k < 2; k++) {
					if (j==k) continue;
					if (i==k) continue;
					for (int l = 0; l < 1; l++) {
						if (j==l) continue;
						if (i==l) continue;
						if (k==l) continue;
						System.out.print(p[i]+ "-" +p[j]+ "-" +p[k]+ "-" +p[l]);
						
					}
					System.out.println();
				}
			}
		}

	}// end of main
}// end of class

class Permutation1{
	
	void p(int[] p, int[] b, int i){
		if(i==p.length){
			
		}else{
			
		}
	}
	
}
