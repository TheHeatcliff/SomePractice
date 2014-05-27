package Testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BetterProgrammerTaskII {

    public static int countAlmostPrimeNumbers(int from, int to) {
        /*
          A prime number is a natural number that has exactly two distinct natural number divisors,
          which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13.

          Almost prime numbers are the non-prime numbers
          which are divisible by only a single prime number.

          Please implement this method to
          return the number of almost prime numbers within the given range (inclusively).
         */
    	
    	int countNumerosCasiPrimos = 0;
    	
    	if (from > to) return 0;
    	
    	if (from < 0) from = 0;
    	
    	for (int i = from; i <= to; i++) {
    		
    		if (!isPrime(i)) {
    			
    			int cantidadNumerosDivisibles = 0;
    			
    			for (int b = 1; b <= i; b++) {
    				
    				if (isDivisible(i,b) && isPrime(b)) {
    					
    					cantidadNumerosDivisibles++;
    					
    					if (cantidadNumerosDivisibles > 1) {
    						break;
    					}
    				}
    			}
    			
    			if (cantidadNumerosDivisibles == 1) {
    				countNumerosCasiPrimos++;
    			}
    		}
    		
    	}
    	
    	return countNumerosCasiPrimos;
    }
    
    private static boolean isDivisible(int i, int b) {
    	return i % b == 0;
	}

	private static boolean isPrime(Integer number) {
		
		if ( (number > 2 && number % 2 == 0) || number < 2) {
			return false;
		}
		
		for (long i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		

		
		int[] array = new int[4];
		array[0] = -1;
		array[1] = -2;
		array[2] = -13;
		array[3] = -33;
		
		int result = getClosestToZero(array);
		
		System.out.println(result);
	}
	
	
	 	
	public static int getClosestToZero(int[] a) {
	        /*
	          Please implement this method to
	          return the number in the array that is closest to zero.
	          If there are two equally close to zero elements like 2 and -2
	          - consider the positive element to be "closer" to zero.
	         */
	    	
	    	Integer extremoPositivo = null;
	    	Integer extremoNegativo = null;
	    	
	    	Arrays.sort(a);
	    	
	    	for (int i : a) {
				if (i >= 0){
					extremoPositivo = i;
					break;
				}
			}
	    		    	
	    	for (int i = a.length-1; i >= 0; i--){
	    		
	    		if (a[i] < 0) {
	    			extremoNegativo = a[i];
	    				break;
	    		}
	    	}
	    	
	    	if (extremoNegativo == null && extremoPositivo != null){
	    		return extremoPositivo;
	    	}
	    	
	    	if (extremoNegativo != null && extremoPositivo == null){
	    		return extremoNegativo;
	    	}
	    	
	    	if (extremoNegativo + extremoPositivo == 0){
	    		return extremoPositivo;
	    	}
	    	
	    	if (Math.abs(extremoNegativo) > extremoPositivo ){
	    		return extremoPositivo;
	    	}
	    	
	    	if (Math.abs(extremoNegativo) < extremoPositivo ){
	    		return extremoNegativo;
	    	}
	    	
	    	return 0;
	   
	    }
	
	    public static class WriteOnceMap<K, V> extends HashMap<K, V> {

	        public V put(K key, V value) {
	            /*
	             WriteOnceMap is a map that does not allow changing value for a particular key.
	             It means that put() method should throw IllegalArgumentException if the key is already
	             assosiated with some value in the map.

	             Please implement this method to conform to the above description of WriteOnceMap.
	            */
	        	
	        	
	        	if (this.containsKey(key)) {
	        		throw new IllegalArgumentException();
	        	}
	        	
	        	return this.put(key, value);
	        }


	        public void putAll(Map<? extends K, ? extends V> m) {
	            /*
	             Pleaase implement this method to conform to the description of WriteOnceMap above.
	             It should either
	             (1) copy all of the mappings from the specified map to this map or
	             (2) throw IllegalArgumentException and leave this map intact
	             if the parameter already contains some keys from this map.
	            */
	        	
	        	
	        	if (this.keySet().retainAll(m.keySet())){
	        		throw new IllegalArgumentException();
	        	}
	        	
	        	this.putAll(m);
	        }
	        
	    }

}

	
	
    
