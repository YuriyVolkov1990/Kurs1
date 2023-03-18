package pro.sky.java.course1.courseWork;

public class Employee {
    private final String person;//содержит ФИО сотрудника
    private int depart;//отдел 1-5
    private int salary;//зарплата
    int id;//id сотрудника

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
    this.id = Main.counterId++;
    }

    @Override
    public String toString() {
        return "Сотрудик {" +
                "ФИО='" + person + '\'' +
                ", Отдел=" + depart +
                ", Зарплата=" + salary +
                ", id=" + getId() +
                '}';
    }
}
