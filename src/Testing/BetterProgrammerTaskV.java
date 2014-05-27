package Testing;

import java.util.HashSet;
import java.util.Set;

public class BetterProgrammerTaskV {

	public static void main(String[] args) {
		
		Set<Object> set1 = new HashSet<>();
		Set<Object> set2 = new HashSet<>();
		
		set1.add(4);
		set1.add(5);
		
		set2.add(5);
		
		Set<Object> intersection = getIntersection(set1, set1);
		
		System.out.println(intersection);
		

	}
	
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
    	
    	Set <Object> intersection = new HashSet<Object>();
    	
    	if (a == null || b == null){
    		return intersection;
    	}
    	
    	if (a.size() == 0 || b.size() == 0){
    		return intersection;
    	}
    	
    	for (Object object : a) {
    		
    		if (b.contains(object)){
    			intersection.add(object);
    		}
    	
    	}
    	
    	return intersection;
    	
    }

}
