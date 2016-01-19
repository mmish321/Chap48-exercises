public class SubAverage {
	public static void main ( String[] args ) {
		int[] values = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
		Weight june = new Weight(values);
		june.print();

		int Avg1 = june.subAverage(0, values.length/2);
		int Avg2 = june.subAverage(values.length/2, values.length-1);
		
		System.out.println("Average: " + june.average());
		System.out.println("Sub Average 1: "+ Avg1);  
	    System.out.println("Sub Average 2: "+ Avg2);
	    System.out.println("Difference: " + (Avg2 - Avg1));
	}
}