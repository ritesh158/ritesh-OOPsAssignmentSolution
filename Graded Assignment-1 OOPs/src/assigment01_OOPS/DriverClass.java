package assigment01_OOPS;

public class DriverClass {
	// main method
	public static void main(String[] args) {
		AdminDepartment obj1 = new AdminDepartment(); //creating admin object
		HrDepartment obj2 = new HrDepartment(); //creating hr object
		TechDepartment obj3 = new TechDepartment(); //creating tech object
		
		System.out.println("\n" +"Welcome to "+ obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());		
	
		System.out.println("\n" +"Welcome to "+ obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.isTodayAHoliday());		

		System.out.println("\n" +"Welcome to "+ obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.doActivity());
		System.out.println(obj3.isTodayAHoliday());
		
	}

}
