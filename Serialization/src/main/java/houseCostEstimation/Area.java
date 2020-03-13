package houseCostEstimation;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = new Calculate();
		String filename = "ResultArea.ser";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Type Of Material:");
		System.out.println("1.StandardMaterial");
		System.out.println("2.Above StandardMaterial");
		System.out.println("3.High StandardMaterial");
		System.out.println("4.High StandardMaterial and AutomatedHome");
		int choice = scan.nextInt(); 
		System.out.println("Enter no.of Squarefeets:");
		double cost = scan.nextDouble();
		try {
			FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(cal); 
            PrintStream solution = new PrintStream(new FileOutputStream(FileDescriptor.out));
    		switch(choice) {
    		case 1:solution.println("\n Construction cost per StandardMaterial: "+cal.calculate(cost,1200));
    		break;
    		case 2:solution.println("\n Construction cost per Above StandardMaterial:"+cal.calculate(cost,1500));
    		break;
    		case 3:solution.println("\n Construction cost per High StandardMaterial:"+cal.calculate(cost,1800));
    		break;
    		case 4:solution.println("\n Construction cost per StandardMaterial and AutomatedHome:"+cal.calculate(cost,2500));
    		break;
    		default:solution.println("\n Invalid Input...");
    		}
            out.close(); 
            file.close();  
            System.out.println("\n Object has been serialized."); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 


	}

}
