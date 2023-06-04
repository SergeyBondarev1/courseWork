package courseWork;

public class Main {
    static void printAllArr(){
        for (Employee employee : employee) {
                System.out.println(employee+ " ");
            }
        }
    static int sumSalary() {
        int sum = 0;
        for (Employee employee : employee) {
                sum += employee.getSalary();
            }
        return sum;
    }
    static void minSalary(){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee [i].getSalary() < min ){
                min = employee[i].getSalary();
                index = i;
            }
        }
        System.out.println("Минимальная ЗП :" + min + " у сотрудника " + employee[index]);
    }
    static void maxSalary(){
        int max = 0;
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary()>max){
                max = employee[i].getSalary();
                index=i;
            }
        }
        System.out.println("Максимальная  ЗП :" + max + " у сотрудника " + employee[index]);
    }
    private static final Employee [] employee = new Employee[7];

    public static void main (String [] args) {
        employee [0] =new Employee("Петров", "Петр", "Петрович", 1, 54000);
        employee [1] =new Employee("Иванов", "Иван", "Иванович", 4, 34000);
        employee [2] =new Employee("Александров", "Александр", "Александрович", 2, 100000);
        employee [3] =new Employee("Петлев", "Сергей", "Анатольевич", 2, 94000);
        employee [4] =new Employee("Лавров", "Константин", "Егоровчич", 3, 45000);
        employee [5] =new Employee("Дунаев", "Денис", "Викторович", 5, 76000);
        employee [6] =new Employee("Краснопятов", "Виталий", "Олегович", 5, 73000);
        printAllArr();
        System.out.println("Сумма затрат " + sumSalary());
        minSalary();
        maxSalary();
    }

}

