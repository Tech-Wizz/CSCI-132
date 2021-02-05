package christensen_lab11;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	// Compares two strings according to their lengths.
		public int compare(String a, String b) {
			if (a.length() < b.length()) {
				return -1;
			}else if (a.length( ) == b.length( )) {
				return 0;
			}else {
				return 1;
			}
		}                                             //use the first ^^
		
/*		
		public class DefaultComparator<E> implements Comparator<E> {
			@SuppressWarnings("unchecked")
			public int compare(E a, E b) throws ClassCastException {
				return ((Comparable<E>) a).compareTo(b);
			}
		}
*/
}
