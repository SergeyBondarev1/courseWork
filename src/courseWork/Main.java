package courseWork;

public class Main {
    private static void printAllArr(Employee[]arr){
        for (Employee employee: arr) {
            if (employee != null){
                System.out.println(employee+ " ");
            }
        }
    }
    private static int sumSalary(Employee[]arr) {
        int sum = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                sum += employee.getSalary();

            }
        }
        return sum;
    }

    public static void main (String [] args) {
            Employee emp1 = new Employee("Петров","Петр","Петрович",1,54000);
        System.out.println(emp1);
            Employee emp2 = new Employee("Иванов","Иван","Иванович",4,34000);
        System.out.println(emp2);
            Employee emp3 = new Employee("Александров","Александр","Александрович",2,100000);
        System.out.println(emp3);
            Employee emp4 = new Employee("Петлев","Сергей","Анатольевич",2,94000);
        System.out.println(emp4);
            Employee emp5 = new Employee("Лавров","Константин","Егоровчич",3,45000);
        System.out.println(emp5);
            Employee emp6 = new Employee("Дунаев","Денис","Викторович",5,76000);
        System.out.println(emp6);
            Employee emp7 = new Employee("Краснопятов","Виталий","Олегович",5,73000);
        System.out.println(emp7);




        }





}
