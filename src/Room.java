
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Room {
	List<String> a = new ArrayList<String>(10);
	 int adjacency_matrix[][];
     int number_of_vertices;
     int destination = 0;
     String source = null;
     String Bookname;
     int count=0;
        

//----READ MATRIX----
     public void readmatrix() throws FileNotFoundException {
	 Scanner scan = new Scanner(System.in);
	 number_of_vertices = 10;
     adjacency_matrix = new int[11][11];
     Scanner sc = new Scanner(new File("input.txt"));
     int dimension1 = 11;
	 int dimension2 = 11;
	 int[][] array = new int[dimension1][dimension2];
	 System.out.println("Our graph:distance between of aeach Room");
	 while (sc.hasNextInt()) {
	 	for (int row = 1; row <=10; row++) {
	 		for (int column = 1; column <=10; column++) {
	 			array[row][column] = sc.nextInt();
	 			System.out.printf("%2d ", array[row][column]);
	               }
		 	System.out.println();
		 	}
		 for (int i = 1; i <= number_of_vertices; i++){
		 	for (int j = 1; j <= number_of_vertices; j++){
		 		adjacency_matrix[i][j] =array[i][j];
		 		if (i == j){
		 			adjacency_matrix[i][j] = 0;
		 			continue;
		 			}
		 		if (adjacency_matrix[i][j] == 0){
                     adjacency_matrix[i][j] = Integer.MAX_VALUE;
                     }
			 	}
			} 
		}
	}

     public void PrimMst(){
    	 
		Prim a=new Prim(number_of_vertices);
		
		a.primsAlgorithm(adjacency_matrix);
		a.printMST();
		  
	 }
     public void KnapSack(){
    	 KnapSack k=new KnapSack();
    	 k.solve(adjacency_matrix, destination, number_of_vertices, count);
    	 
     }
}