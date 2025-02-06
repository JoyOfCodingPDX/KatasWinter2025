package edu.pdx.cs.joy.pair11;

// Following imports used for file reading (README):
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Lags {
	public static class Flight {
		String flightID;  
		int startTime;  
		int endTime;  
		int price;   

		// Constructor to initialize a flight object
		public Flight(String flightID, int startTime, int duration, int price) {
			this.flightID = flightID;
			this.startTime = startTime;
			this.endTime = startTime + duration;  // Compute end time
			this.price = price;
		}
	}    
	static String ReadFile(String fileNameOrPath) {
		String ABEAS = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileNameOrPath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line); // Print each line of the file
				ABEAS += line + "\n";
			}
		} catch (IOException e) {
			String error = "Error reading the file: " + e.getMessage();
			System.out.println(error);
			return error;
		}
		return ABEAS;
	}

	@VisibleForTesting
	public static void main(String[] args) {
		System.err.println("Missing command line arguments");
	}
}
