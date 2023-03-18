package pro.sky.java.course1.courseWork;

public class Employee {
    private String person;//содержит ФИО сотрудника
    private int depart;//отдел 1-5
    private int salary;//зарплата
    private int id;
public static int counterId(int id) {
    id = id + 1;
    return id;
    }

public String getPerson() {
    return person;
}
public int getDepart() {
    return depart;
}
public int getSalary() {
    return salary;
}
public int getId() {
    return id;
}
public void setDepart(int depart) {
    this.depart = depart;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public Employee(String person, int depart, int salary) {
    this.person = person;
    this.depart = depart;
    this.salary = salary;
    id = counterId(id);
    }
}
