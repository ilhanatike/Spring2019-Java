package day16_String_manipulation;

import java.util.*;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Type words: ");

		String words = scan.nextLine();

		System.out.println(words.replace("a", "y"));
		System.out.println(words.replace("sad", "happy"));
		

	}

}
