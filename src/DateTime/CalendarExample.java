package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2013,10,28);
		Calendar calendarAfter = new GregorianCalendar(2014,10,28);
		Calendar calendarBefore = new GregorianCalendar(2012,10,28);
		//add(int field, int amount) thêm 1 lượng thời gian
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + (calendar.getTime()));
		
		//boolean after(Object when) kiểm tra thời gian có sau mốc so sánh hay ko
		System.out.println("Date : " + (calendar.after(calendarAfter)));
		//boolean before(Object when) kiểm tra thời gian có trước mốc so sánh hay ko
		System.out.println("Date : " + (calendar.before(calendarBefore)));
		
		// clear() hay clear(int field) xóa tất cả hoặc xóa 1 phần  calendar.clear(Calendar.MONTH);
		calendarBefore.clear(Calendar.DAY_OF_MONTH);
		System.out.println(calendarBefore.getTime());
		
		// clone sao chép đối tượng
		Calendar copy = (Calendar) calendar.clone();
		
		// compare so sánh 2 calendar 
		System.out.println(copy.compareTo(calendar));
		
		// complate() bổ sung các feild còn trống.
		
	      
		
		
		
		
	}
}
