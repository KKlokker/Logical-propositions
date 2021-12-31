public class Matrice {
	 	public static void main(String[] args){
			int[][] matrice = new int[][]{ new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9}};		 	
			boolean square = true;
			boolean validMatrice = true;
			int rowLength = matrice[0].length;
			for(int[] row: matrice)
				if(row.length != rowLength) 
					validMatrice = false;
			System.out.println("Not a vlid matrice");
			for(int[] row: matrice)
				if(row.length != matrice.length) 
					square = false;
			System.out.println("The matrice sqaure is " + square);
			System.out.println("The matrice is");
			print(matrice);
			System.out.println("The transformed matrice is");
			print(transform(matrice));
			if(symmetric(matrice))
				System.out.println("The matrice is symmetric");
		}

		private static boolean symmetric(int[][] matrice) {
			return (transform(matrice) == matrice);
		}
		private static int[][] transform(int[][] matrice) {
			int[][] transform = new int[matrice[0].length][matrice.length];
			for(int i = 0; i < matrice.length; i ++)
				for(int j = 0; j < matrice[0].length; j++)
					transform[j][i] = matrice[i][j];
			return transform;
		}

		private static void print(int[][] matrice) {
			for(int[] row: matrice) {
				for(int coloumn: row)
					System.out.print(coloumn);
				System.out.println();
			}
		}
}
