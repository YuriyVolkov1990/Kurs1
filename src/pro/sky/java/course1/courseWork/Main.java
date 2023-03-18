package pro.sky.java.course1.courseWork;
import java.util.Arrays;


public class Main {
    public static int counterId = 0;
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1,1000000);
        employees[1] = new Employee("Петров Иван Иванович", 2,1000001);
        employees[2] = new Employee("Сидоров Иван Иванович", 3,1000002);
        employees[3] = new Employee("Пвыаып Иван Иванович", 4,1000003);
        employees[4] = new Employee("Квсмстпее Иван Иванович", 5,1000004);
        employees[5] = new Employee("Аиагрпор Иван Иванович", 1,1000005);
        employees[6] = new Employee("Аврьи Иван Иванович", 2,1000006);
        employees[7] = new Employee("Нгшглобр Иван Иванович", 3,1000007);
        employees[8] = new Employee("Уцевыва Иван Иванович", 4,1000008);
        employees[9] = new Employee("Акенп Иван Иванович", 5,1000009);
        System.out.println(Arrays.toString(employees));
        System.out.println("Сотрудник " + employees[0].getPerson() + " из отдела " + employees[0].getDepart() + " переведён в отдел " + employees[0].setDepart(10));
        System.out.println("Сотруднику " + employees[1].getPerson() + " назначена зарплата " + employees[1].setSalary(1) + " рубль");
    }
 }