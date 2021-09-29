import java.util.Arrays;
import java.util.List;

public class CarPooling {
	
	int capacity = 11;
	int[][] trips = {{3,2,7}, {3,7,9}, {8,3,9}};
	
	
	
	void sortTrips(int[][] trips) {
		List<int[]> tripList = Arrays.asList(trips);
		for(int[] t : tripList) {
			System.out.println(t);
		}
	}
			

}
