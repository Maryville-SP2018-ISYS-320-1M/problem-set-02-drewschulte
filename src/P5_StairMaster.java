/*
	ISYS 320
	Name(s):drew schulte
	Date: april 15
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many stairs in your staircase?");
		int stairs = console.nextInt();
		System.out.print("How wide should each stair be?");
		int wide = console.nextInt();
		System.out.println("Here is your staircase");
		Staircase(stairs, wide);

	}

}
