import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DurationCal {
	
	public static void main(String args[]) throws ParseException{
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter first time (hh:mm aa): ");
	 
		String time = input.nextLine();
	 
		System.out.println();
	 
		System.out.println("Enter second time (hh:mm aa): ");
	
		String time2 = input.nextLine();
	 
		System.out.println();
	
		DateFormat sdf = new SimpleDateFormat("hh:mm aa");
	
		Date d1 = sdf.parse(time);
		Date d2 = sdf.parse(time2);
	
		 System.out.println("Time: " + sdf.format(d1));
		 System.out.println("Time: " + sdf.format(d2));
	    
		 if(d1.after(d2)){
		     long diffMs = d1.getTime() - d2.getTime();
		     //diffMS = diffMs - (60*)
		    // long diffSec = diffMs / 1000;
		     long min = diffMs / (60*1000);
		     min = min - 60 ;
		     
		     //long sec = diffSec % 60;
		     System.out.println("The difference is "+min+" minutes ");
	    }
	
		   if(d1.before(d2)){
		     long diffMs = d2.getTime() - d1.getTime();
		     //diffMS = diffMs - (60*)
			    // long diffSec = diffMs / 1000;
			     long min = diffMs / (60*1000);
			     min = min - 60 ;
			     
			     //long sec = diffSec % 60;
			     System.out.println("The difference is "+min+" minutes ");
		    }
	
	    if(d1.equals(d2)){
	     System.out.println("The difference is 0 minutes and 0 seconds.");
	    }
	
	 }
}
