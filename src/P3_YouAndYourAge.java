import java.util.Scanner;

/*
	ISYS 320
	Name(s):drew schulte
	Date: april 15
*/

public class P3_YouAndYourAge {

	public static void main(String[] args) {
Scanner input=new Scanner (System.in);
String Name; 
int age; 
System.out.println("what is your name ");
Name=input.next();
System.out.println("And how old are you?");
age=input.nextInt();
System.out.print("WOW " + Name + " you've been alive " + age + " years? Amazing.");
	}

}
