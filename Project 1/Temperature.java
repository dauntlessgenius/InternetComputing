
import java.util.Scanner;
public class Temperature {
   public static void main(String[] args)
   {
	   Scanner scan =new Scanner(System.in);
	   
	   float celcius;
	   
	   System.out.println("Enter Temperature in fahrenheit : ");
	   
	   float fahrenheit= scan.nextFloat();
	   
	   celcius= (fahrenheit-32)*(5/9);
	   System.out.println("Temperature in Celcius: "+celcius);
	   
   }
}
