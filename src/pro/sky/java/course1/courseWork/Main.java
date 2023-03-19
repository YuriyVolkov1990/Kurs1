package pro.sky.java.course1.courseWork;
import java.util.Arrays;


public class Main {
    public static int counterId = 0;

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 1);
        employees[1] = new Employee("Петров Иван Иванович", 2, 2);
        employees[2] = new Employee("Сидоров Иван Иванович", 3, 3);
        employees[3] = new Employee("Пвыаып Иван Иванович", 4, 4);
        employees[4] = new Employee("Квсмстпее Иван Иванович", 5, 5);
        employees[5] = new Employee("Аиагрпор Иван Иванович", 1, 6);
        employees[6] = new Employee("Аврьи Иван Иванович", 2, 7);
        employees[7] = new Employee("Нгшглобр Иван Иванович", 3, 8);
        employees[8] = new Employee("Уцевыва Иван Иванович", 4, 9);
        employees[9] = new Employee("Акенп Иван Иванович", 5, 10);
        System.out.println(Arrays.toString(employees));//в задании сказано создать статический метод toString, но это метод объекта, разве он может быть static? и Java ругается если попытаться сделать его static
        System.out.println("Сотрудник " + employees[0].getPerson() + " из отдела " + employees[0].getDepart() + " переведён в отдел " + employees[0].setDepart(10));
        System.out.println("Сотруднику " + employees[1].getPerson() + " назначена зарплата " + employees[1].setSalary(2) + " р.");
        int sum = 0;
        int minSalary = employees[0].getSalary();
        int maxSalary = employees[1].getSalary();
        boolean rule = maxSalary>minSalary;
        for (int i = 0; i <= 9; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println(sum);
        for (Employee i:
             employees) {
            if (!rule) {
                minSalary=employees[1].getSalary();
            }
        }


        }

}