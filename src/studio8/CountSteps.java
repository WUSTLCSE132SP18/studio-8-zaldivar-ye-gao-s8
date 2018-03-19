package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps {
	
	public static void main(String[] args) throws FileNotFoundException {
		int stepCount = 0;
		
		List<Double> readings = new ArrayList<Double>();
		File file = new File("data/data.csv");
		Scanner s = new Scanner(file);
		while (s.hasNextLine()) {
			String line = s.nextLine();
			double z = new Double(line.split(",")[2]).doubleValue();
//			System.out.println(z);
			readings.add(z);
		}
		
//		double [] arr = new double[readings.size()];
//		
//		arr = readings.toArray(new Double[readings.size()]);
		
//		for (int i = 1; i < readings.size()-1; i++) {
//			if (readings.get(i) > readings.get(i-1) && readings.get(i) > readings.get(i+1)) {
//				stepCount ++ ;
//			}
//		}
		
		for (int i = 1; i < readings.size()-1; i++) {
			if (readings.get(i) > readings.get(i-1) && readings.get(i) > readings.get(i+1)) {
				stepCount ++ ;
			}
		}
		System.out.println("steps counted : " + stepCount);
		
	}
}