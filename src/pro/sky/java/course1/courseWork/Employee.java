package pro.sky.java.course1.courseWork;

public class Employee {
    private final String person;
    private int depart;
    private double salary;
    private static int counter = 0;
    private final int id;

    public Employee(String person, int depart, double salary) {
        this.person = person;
        this.depart = depart;
        this.salary = salary;
        this.id=counter++;
    }
    public int getId() {
        return this.id;
    }
    public String getPerson() {
        return this.person;
    }

    public int getDepart() {
        return this.depart;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static Employee[] employees = new Employee[10];
    public static void getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static double getSumSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    public static Employee getMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee =employee;
            }
        }
        return  minSalaryEmployee;
    }
    public static Employee getMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }
    public static double getAverageSalary() {
        double totalSalary = getSumSalary();
        return totalSalary / employees.length;
        }
    public static String[] getEmployeesFullNames() {
        String[] employeesFullNames = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employeesFullNames[i]=employees[i].getPerson();
            }
        return  employeesFullNames;
    }
    @Override
    public String toString() {
        return "Сотрудик №" + getId() + " ФИО " + getPerson() + "." + " Отдел " + getDepart() + " Зарплата: " + getSalary();
    }
}
