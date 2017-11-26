
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Test {
	public static void main(String args[]) throws IOException{
		
		Room room=new Room();
		room.readmatrix();
		room.PrimMst();
		room.KnapSack();
//		System.out.print("Enter room names like this: Psychlogy,Biology etc.");
//		while(true){
//		     System.out.print("\nInput: ");
//		     String str=input.next();
//		     if(str.equalsIgnoreCase("Location")){
//		    	 room.Location();
//		     }
//		     if(str.equalsIgnoreCase("Initialize")){
//		    	 string=input.next();
//		    	 System.out.print("Output:Initialized ");
//		    	 room.initliaze(string);
//		     }
//		     if(str.equalsIgnoreCase("Quit")){
//		    	 room.Quit();
//		    	 System.out.println();
//		     }
//		     if(str.equalsIgnoreCase("Find")){
//		    	 string=input.next();
//		    	 String book=input.nextLine();
//		    	 room.Find(string, book);
//		     }
//		     if(str.equalsIgnoreCase("List")){
//		    	 System.out.print("Output: ");
//		    	 String x=input.next();
//		    	 room.list(x);
//		    	 System.out.println();
//		     }
//		     if(str.equalsIgnoreCase("insert")){
//		    	 string=input.next();
//		    	 String book=input.nextLine();
//		    	 room.insert(string,book);
//		    	 }
//		     }
//		}
	}
}
