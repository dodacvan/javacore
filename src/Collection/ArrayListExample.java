package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 * @author VanDD
 *
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList with Capacity 4
        ArrayList<String> StudentList = new ArrayList<String>(4);
        // Added 4 elements
        StudentList.add("David");
        StudentList.add("Tom");
        StudentList.add("Rohit");
        StudentList.add("Paul");
        StudentList.add("David");

        // Increase capacity to 10
        StudentList.ensureCapacity(10);

        StudentList.add("Vishal");
        // Print all the elements available in list
        for (String s : StudentList) {
            System.out.println(s);
        }
        
        // indexOf trả về chỉ số lần xuất hiện đầu tiên hoặc -1 nếu ko có
        
        System.out.println(StudentList.indexOf("David")); // 0 firstElement
        System.out.println(StudentList.indexOf("Van")); // -1 
        
        // lastIndexOf
        System.out.println(StudentList.lastIndexOf("David")); // 4
        
        // listIterator
        ListIterator<String> listit = StudentList.listIterator();
        while(listit.hasNext()){
            System.out.println(listit.next());            
         }
        
        // listIterator(int index) start at index
        ListIterator<String> listi2t = StudentList.listIterator(2);
        System.out.println("listIterator(int index)");
        while(listi2t.hasNext()){
            System.out.println(listi2t.next());            
        }
        
        // clear() remove all
        
        // clone() copy arraylist
        
        // contains(Object o) return boolean if arraylist chứa object
        
        // get(int index) return object
        
        // indexOf(Object o) trả lại vị trí đầu tiên
        
        // isEmpty() kiểm tra có empty hay ko
        
        // remove(int index),   remove(Object o) remove cái đầu tiên trùng
        // removeAll
        ArrayList<String> rmove = new ArrayList<String>();
        rmove.add("David");
        StudentList.removeAll(rmove);
        
        // removeRange(int fromIndex, int toIndex) remove from to 
        
        // replaceAll
        StudentList.replaceAll( (String x) -> x.toLowerCase());
        for (String item: StudentList) {
            System.out.println(item);
        }
        
        // return List method   subList(int fromIndex, int toIndex)
        
        // trimToSize() làm cho capacity vừa đủ
        
    }
}
