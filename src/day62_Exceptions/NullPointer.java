package day62_Exceptions;

public class NullPointer {
static String name;


public static void main(String[] args) {
	try {
	System.out.println(name.toUpperCase());
	}catch(NullPointerException e ) {
		System.out.println("NullPointerException happened");
		System.out.println("here is the message "+e.getMessage());
		System.out.println("Here is the stackTrace");
		e.printStackTrace();
	}
	
}
		
		
		
		
		
	

}
