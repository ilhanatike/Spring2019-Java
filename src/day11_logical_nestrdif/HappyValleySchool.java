package day11_logical_nestrdif;
import java.util.*;
public class HappyValleySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scan = new Scanner(System.in);

		 
	    int age;
	    System.out.println("Enter age:");
	    age=scan.nextInt();
	     if(age<2 || age>18){
	     System.out.println("ineligible");
	     }else if(age==2){
	     System.out.println(" toddler");
	     }else if(age>=3 && age<=5){
	     System.out.println("early childhood");
	     }else if(age==6||age==7){
	     System.out.println("young reader");
	    }else if(age>=8 &&age<=10){
	    System.out.println("elementary");
	    }else if(age==11||age==12){
	System.out.println(" middle") ;   
	   }else if(age==13){
	    System.out.println("impossible");
	    }else if(age>=14 && age<=16){
	    System.out.println("high school");
	  }else if(age>=17 && age<=18){
	    System.out.println("scholar");
	  }
	    
	   
	
		    
		  }
		}