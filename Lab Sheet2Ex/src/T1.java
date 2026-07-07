
import java.util.ArrayList;

	public class T1 {
	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();

	     
	        names.add("Alice");
	        names.add("Emma");
	        names.add("Leon");
	        names.add("John");

	        // แสดงผลขนาดข้อมูล และ ข้อมูลทั้งหมด
	        System.out.println("Length = " + names.size());
	        System.out.println("All names in ArrayList = " + names);
	    }
	}