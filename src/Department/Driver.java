package Department;

public class Driver {
	public static void main(String args[]) {
		
		HRDepartment hr = new HRDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.isTodayAHoliday());
	}
}
