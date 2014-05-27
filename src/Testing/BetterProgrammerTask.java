package Testing;

public class BetterProgrammerTask {

    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
    	
    	Object[] myCopy = new Object[a.length];
        
    	int counter = 0;
    
    	for (int i = a.length-1; i >= 0; i--) {
    		myCopy[counter] = a[i];
    		counter++;
    	}
    	
    	return myCopy;
    }
    
    
    public static void main(String[] args) {
    	
    	Integer[] array = new Integer[3];
    	array[0]=1;
    	array[1]=2;
    	array[2]=3;
    	
    	Object[] integerArray = reverseArray(array);
    	
    	for (Object object : integerArray) {
			System.out.println((Integer)object);
		}
    }
}