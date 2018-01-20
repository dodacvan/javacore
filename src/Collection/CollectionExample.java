package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 
 * @author vandd
 *
 */
public class CollectionExample {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> myCollection = new ArrayList<String>();
		
		// add - add to element
		myCollection.add("one");
		
		Collection<String> myCollection2 = new ArrayList<String>();
		myCollection2.add("two");
		myCollection2.add("three");
		
		Collection<String> myCollection3 = new ArrayList<String>();
		myCollection3.add("two");
		myCollection3.add("three");
		
		Collection<String> single = new ArrayList<String>();
		single.add("two");
		
		// addAll 
		myCollection.addAll(myCollection2);
		
		// contains
		System.out.println(myCollection.contains("one"));
		
		// contains all
		System.out.println(myCollection.containsAll(myCollection2));
		System.out.println(myCollection2.containsAll(myCollection));
		
		// equals 
		System.out.println(myCollection.equals(myCollection2));
		System.out.println(myCollection3.equals(myCollection2));
		System.out.println(single.equals("two"));
		
		// hashCode
		
		// isEmpty
		
		// iterator()
		Iterator<String> rs = myCollection.iterator();
		while (rs.hasNext()) {
			System.out.println(rs.next());
		}
		
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream(); 
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println(evenNumbersArr);
        
        // remove()
        myCollection3.add("three");
        System.out.println(myCollection3);  // two three three
        myCollection3.remove("three");
        System.out.println(myCollection3); // two three
        
        // removeAll()
        myCollection3.removeAll(single); // now col 3 include two three and single inclue two so. two is remove
        System.out.println(myCollection3);
        
        // removeIf
        myCollection3.add("One");
        myCollection3.add("One1");
        myCollection3.add("two");
        Predicate<String> p = (x) -> x.substring(0, 1).equals("O"); // get fisrt element of value
        myCollection3.removeIf(p);
        System.out.println(myCollection3);
        // result three two
        
        // retailAll()
        myCollection3.retainAll(single); // reme three becase it not contains in single
        System.out.println(myCollection3);
        // result two
        
        // size()
        System.out.println(myCollection3.size());
        // result 1
        
        // clear all element
        myCollection3.clear();
        System.out.println(myCollection3);
        // result empty
        
        // toArray 
        String[] array = myCollection.toArray(new String[myCollection.size()]);
        System.out.println(array[0]);
        Object[] myarray = myCollection.toArray();
        System.out.println(myarray[0]);
        
        Spliterator<String> mySpliterator;
        mySpliterator = myCollection.spliterator();
        
        System.out.println("Characteristics Of Spliterator are : "+mySpliterator.toString());
        
	}
}
