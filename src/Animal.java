import java.util.Scanner;

public class Animal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean bool = false;
		while (!bool) {
			System.out.println("What animal would you like to see: a dog or a cat?");
			String res = sc.nextLine();
			
			if(res.toLowerCase().contains("cat")) {
				System.out.println("(\"`-\'\'-/\").___..--\'\'\"`-._ \n `6_ 6  )   `-.  (     ).`-.__.`) \n (_Y_.)\'  ._   )  `._ `. ``-..-\' \n   _..`--\'_..-_/  /--\'_.\'\n  ((((.-\'\'  ((((.\'  (((.-\' ");
				bool = true;
			}
			else if (res.toLowerCase().contains("dog")){
				System.out.println("   / \\__\n  (    @\\___\n  /         O\n /   (_____/\n/_____/   U");
				bool = true;
			}
			else if (res.toLowerCase().contains("fish")){
				System.out.println("          /\"*._         _\n      .-*\'`    `*-.._.-\'/\n    < * ))     ,       ( \n      `*-._`._(__.--*\"`.\\");
				bool = true;
			}
			else {
				System.out.println("Error: Invalid option");
			}
		}
		
		System.out.println("Program finished.");
	}
	
}
