import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte
	Date: april 15
*/

public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		while (input.hasNextLine() ) {
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
			while (lineScanner.hasNext()) {
				String word = lineScanner.next();
				word = word.replace("a", "4"); 
				word = word.replace("e", "3"); 
				word = word.replace("t", "7"); 
				word = word.replace("o", ""); 
			}
			output.print(" (" + word + ") ");
		}
output.println();
	}

}
