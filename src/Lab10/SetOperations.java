package Lab10;

import java.util.Arrays;
import java.util.HashSet;

public class SetOperations {
/**
 * Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"} 
 * and find and print their union, difference, and intersection. Implement public static methods for all these operations. 
 * (You can clone the sets to preserve the original sets from being changed by these set methods.)
 * @param <E>
 */
	
	public static void main(String[] args) {
		String[] array1 = new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] array2 = new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		
		HashSet<String> set1 = new HashSet<>(Arrays.asList(array1));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(array2));
		
		System.out.println("Union: " + setUnion(set1, set2));
		System.out.println("Difference: " + setDifference(set1, set2));
		System.out.println("Intersection: " + setIntersection(set1, set2));

	}
	
	public static <E> HashSet<E> setUnion (HashSet<E> set1, HashSet<E> set2) {
		HashSet<E> union = (HashSet<E>) set1.clone();
		
		union.addAll(set2);
		
		return union;
	}
	
	public static <E> HashSet<E> setDifference (HashSet<E> set1, HashSet<E> set2) {		
		HashSet<E> diff1 = (HashSet<E>) set1.clone();
		HashSet<E> diff2 = (HashSet<E>) set2.clone();
		
		diff1.removeAll(set2);
		diff2.removeAll(set1);	
		diff1.addAll(diff2);
		
		return diff1;
	}
	
	public static <E> HashSet<E> setIntersection (HashSet<E> set1, HashSet<E> set2) {
		HashSet<E> intersection = (HashSet<E>) set1.clone();
		
		intersection.retainAll(set2);
		
		return intersection;
	}
}
