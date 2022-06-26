import Department.AdminDepartment;
import Department.HRDepartment;
import Department.SuperDepartment;
import Department.TechDepartment;

public class Main {
  public static void main(String[] args) {
    AdminDepartment adminDepartment = new AdminDepartment();
    HRDepartment hrDepartment = new HRDepartment();
    TechDepartment techDepartment = new TechDepartment();

    //Admin Department details
    System.out.println("Welcome to " + adminDepartment.deparmentName());
    System.out.println(adminDepartment.getTodaysWork());
    System.out.println(adminDepartment.getWorkDeadline());
    System.out.println(adminDepartment.isTodayAHoliday());
    System.out.println();

    // HR Department details
    System.out.println("Welcome to " + hrDepartment.deparmentName());
    System.out.println(hrDepartment.doActivity());
    System.out.println(hrDepartment.getTodaysWork());
    System.out.println(hrDepartment.getWorkDeadline());
    System.out.println(hrDepartment.isTodayAHoliday());
    System.out.println();

    // Tech Department details
    System.out.println("Welcome to " + techDepartment.deparmentName());
    System.out.println(techDepartment.getTodaysWork());
    System.out.println(techDepartment.getWorkDeadline());
    System.out.println(techDepartment.getTechStackInformation());
    System.out.println(techDepartment.isTodayAHoliday());
  }
}
