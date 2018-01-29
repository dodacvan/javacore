package Collection;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays chứa các phương thức để điều khiển các mảng như sort and search Nó
 * cũng cung cấp các Static factory cho phép array như là list
 * 
 * @author vandd
 *
 */
public class ArraysExample {
	public static void main(String[] args) {
		Integer ar[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };

		// asList Trả lại một list có kích thước cố định từ 1 mảng được chỉ
		// định.
		List<Integer> l1 = Arrays.asList(ar);
		System.out.println(l1);

		// binarySerach trả lại vị trí sử dụng giải thuật binarySearch, array
		// phải được sắp xếp trước.
		Arrays.sort(ar); // sort sắp xếp theo thứ tự bé đến lớn và sort(int[] a,
							// int fromIndex, int toIndex)
		int index = Arrays.binarySearch(ar, 9);
		System.out.println("Position of 9 in sorted" + " arrays is => \n" + index);

		// Copy the whole array
		Integer[] copy = Arrays.copyOf(ar, ar.length);
		System.out.println("Copied array => \n" + Arrays.toString(copy));

		// Copy a specified range into a new array.
		Integer[] rcopy = Arrays.copyOfRange(ar, 1, 5);
		System.out.println("Copied subarray => \n" + Arrays.toString(rcopy));
		
		// deepToString() convert mảng nhiều chiều thành String , hoạt động tốt với cả mảng 1 chiều nhưng ko chấp nhận kiểu
		// dữ liệu nguyên thủy cho mảng một chiều
		// Create a 2D array
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;
 
        // print 2D integer array using deepToString()
        System.out.println(Arrays.deepToString(mat));
        
        // deepEquals so sánh 2 đối tượng , true nếu có cùng số lượng và cặp value key
        Object[] b1 = new Object[] { 'a', 'b' };
        Object[] b2 = new Object[] { 'a', 'b' };
        System.out.println("Array1 and Array2 are equal:" + Arrays.deepEquals(b1,b2));
        System.out.println("Array1 and Array2 are equal:" + Arrays.equals(b1,b2));
        Object[] object1 = new Object[]{"first", "second", new String[]{"third"}}; // so sánh đến cả object con third còn equals nó ko so sánh nên false
        Object[] object2 = new Object[]{"first", "second", new String[]{"third"}};
        System.out.println("Compare object1 and object2 Using HashCode and Equals: " + Arrays.equals(object1, object2));
        System.out.println("Compare object1 and object2 Using DeepHashCode and DeepEquals: " + Arrays.deepEquals(object1, object2));
        
        // fill điền giá trị đặc biệt , fill(Object[] a, int fromIndex, int toIndex, Object val)
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" + " with 10\n" + Arrays.toString(ar));
        
        String[] arr = new String[10];
        Arrays.setAll(arr, (myIndex) -> Integer.toString(myIndex + 1)); // parallelSetAll cũng thế nhưng nhanh hơn với dữ liệu lớn
        System.out.println(Arrays.toString(arr));
        
	}
}
