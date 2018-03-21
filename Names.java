import java.util.Scanner;
public class Names {
	public static void main (String[]args){
		String[] names =new String[3];
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three names");
		names[0]= scan.nextLine();
		names[1]= scan.nextLine();
		names[2]= scan.nextLine();
		
		System.out.println(names[1]);
	}
}
