package pro.sky.java.course1.courseWork;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Employee.employees[0] = new Employee("Иванов Иван Иванович", 1, 1);
        Employee.employees[1] = new Employee("Петров Иван Иванович", 2, 2);
        Employee.employees[2] = new Employee("Сидоров Иван Иванович", 3, 3);
        Employee.employees[3] = new Employee("Пвыаып Иван Иванович", 4, 4);
        Employee.employees[4] = new Employee("Квсмстпее Иван Иванович", 5, 5);
        Employee.employees[5] = new Employee("Аиагрпор Иван Иванович", 1, 6);
        Employee.employees[6] = new Employee("Аврьи Иван Иванович", 2, 7);
        Employee.employees[7] = new Employee("Нгшглобр Иван Иванович", 3, 8);
        Employee.employees[8] = new Employee("Уцевыва Иван Иванович", 4, 9);
        Employee.employees[9] = new Employee("Акенп Иван Иванович", 5, 10);
        System.out.println(Arrays.toString(Employee.employees));
        Employee.employees[1].setSalary(30);
        System.out.println("Сотруднику " + Employee.employees[1].getPerson() + " назначена зарплата " + Employee.employees[1].getSalary() + "р.");
        Employee.employees[4].setDepart(10);
        System.out.println("Сотрудник " + Employee.employees[4].getPerson() + " переведён в отдел " + Employee.employees[4].getDepart());
        System.out.println();
        Employee.getAllEmployees();
        double sumSalary = Employee.getSumSalary();
        System.out.println("Суммарная зп: " + sumSalary);
        Employee minSalaryEmployee = Employee.getMinSalary();
        System.out.println("Минимальная зп: " + minSalaryEmployee);
        Employee maxSalaryEmployee = Employee.getMaxSalary();
        System.out.println("Максимальная зп: " + maxSalaryEmployee);
        double averageSalary = Employee.getAverageSalary();
        System.out.println("Средняя зп: " + averageSalary);
        String[] employeesFullNames = Employee.getEmployeesFullNames();
        System.out.println("ФИО:");
        for (String fullName : employeesFullNames) {
            System.out.println(fullName);
        }

    }

}