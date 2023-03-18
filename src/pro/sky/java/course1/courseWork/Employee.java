package pro.sky.java.course1.courseWork;

public class Employee {
    private final String person;//содержит ФИО сотрудника
    int depart;//отдел 1-5
    int salary;//зарплата
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
public int setDepart(int depart) {
    this.depart = depart;
    return depart;
}
public int setSalary(int salary) {
    this.salary = salary;
    return salary;
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
                "ФИО='" + getPerson() + '\'' +
                ", Отдел=" + getDepart() +
                ", Зарплата=" + getSalary() +
                ", id=" + getId() +
                '}';
    }
}
