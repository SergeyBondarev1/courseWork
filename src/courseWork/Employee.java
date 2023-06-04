package courseWork;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int salary;

    private static int idCounter;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        if (department > 0 && department < 6){
            this.department=department;
        } else {
            throw new IllegalArgumentException("В компании 5 отделов");
        }
        this.department = department;
        if (salary>=0) {
            this.salary = salary;
        }
        id = idCounter++;
    }

    public int getId() {
        return id++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDepartment(int department) {
        if (department > 0 && department < 6){
            this.department=department;
        } else {
            throw new IllegalArgumentException("В компании 5 отделов");
        }
    }

    public void setSalary(int salary) {
        if (salary > 0) ;
        this.salary = salary;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
