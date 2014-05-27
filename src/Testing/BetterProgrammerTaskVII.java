package Testing;

import java.util.Arrays;

public class BetterProgrammerTaskVII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[3];
		
		array[0]=-4;
		array[1]=-10;
		array[2]=-5;
		
		System.out.println(getClosestToZero(array));
	}
	
	
	
	public static int getClosestToZero(int[] a) {
        /*
          Please implement this method to
          return the number in the array that is closest to zero.
          If there are two equally close to zero elements like 2 and -2
          - consider the positive element to be "closer" to zero.
         */
		
		Arrays.sort(a);
		
		Integer rightExtreme = null;
		Integer leftExtreme = null;
		
		for (int i = 0; i < a.length; i++ ) {		
			if (a[i] > 0) {
				rightExtreme = a[i];
				break;
			}
		}
		
		for (int i = a.length-1; i >= 0; i-- ) {
			
			if (a[i] < 0) {
				leftExtreme = a[i];
				break;
			}
		}
		
		if (rightExtreme == null && leftExtreme == null) { 
			return 0;
		}
		
		if (rightExtreme == null && leftExtreme != null) {
			return leftExtreme;
		}
		
		if (rightExtreme != null && leftExtreme == null) {
			return rightExtreme;
		}
		
		if (rightExtreme != null && leftExtreme != null) {
			if (leftExtreme + rightExtreme == 0) return rightExtreme; 
			if (leftExtreme + rightExtreme < 0) return rightExtreme; 
			return leftExtreme; 
		}
		return 0;
    }
}
