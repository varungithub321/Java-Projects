import java.time.YearMonth;
import java.util.Date;
public class Application {

	public static void main(String[] args) {
		Staff s1 = new Staff();
		Teacher t1 = new Teacher();
		Student st1 = new Student();
		Date now = new Date();
		YearMonth y = new YearMonth(2017, 12);
		
		
		System.out.println("The student's attendance is " + st1.getAttendance());
		System.out.println("The teacher's attendance is " + t1.getAttendance());
		System.out.println("The staff's attendance is " +s1.getAttendance());
		System.out.println("The student's grade is " +st1.getgrades());
		System.out.println(now.clone());
		YearMonth.of(2017, 12);
		System.out.println(y.lengthOfMonth());
	}

}
