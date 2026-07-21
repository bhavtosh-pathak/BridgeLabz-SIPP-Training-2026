abstract class e {

    private int employeeId;
    private String employeeName;

    // Constructor
    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getter and Setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    // Abstract method
    abstract double calculateSalary();


    // Concrete method
    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}


// Full Time Employee
class FullTimeEmployee extends Employee {

    private double monthlySalary;


    FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }


    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}


// Part Time Employee
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;


    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }


    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}



// Main Class
public class EMPLOYEE_PAYROLL {

    public static void main(String[] args) {


        FullTimeEmployee fullTime =
                new FullTimeEmployee(101, "Pradeep", 50000);


        PartTimeEmployee partTime =
                new PartTimeEmployee(102, "Rahul", 80, 500);


        System.out.println("Full Time Employee Details");
        fullTime.displayEmployeeInfo();
        System.out.println("Salary: " + fullTime.calculateSalary());


        System.out.println("\nPart Time Employee Details");
        partTime.displayEmployeeInfo();
        System.out.println("Salary: " + partTime.calculateSalary());

    }
}