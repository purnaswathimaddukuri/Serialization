package toolsQA.Serialization;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CleanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res = new Result();
		String filename  = "ResultInterest.ser";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Principle Amount:");
		double principleAmount = scan.nextDouble();
		System.out.println("\nEnter the duration in years:");
		int time = scan.nextInt();
		System.out.println("\n Enter the rate of Interest:");
		double rate = scan.nextDouble();
		System.out.println("\n Enter the no.of times Compounded:");
		int compoundTimes = scan.nextInt();
		try {
			FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(res); 
            PrintStream solution = new PrintStream(new FileOutputStream(FileDescriptor.out));
            solution.println("\n Compound Interest: "+res.compoundInterest(principleAmount,time,rate,compoundTimes));
            solution.println("\n Simple Interest: "+res.simpleInterest(principleAmount,time,rate));  
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
