package readFile;
import java.time.*;

public class dateandtime {
	public static void main(String[] args) {
		LocalDateTime myDateTime = LocalDateTime.now();
		LocalTime myTime = LocalTime.now();
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		System.out.println(myTime);
		System.out.println(myDateTime);
	}
}
