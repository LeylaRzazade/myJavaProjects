package Lesson3;

//EMPLOYEE CLASS --> (Создать класс "Сотрудник" с полями: ФИО, должность,
// email, телефон, зарплата, возраст.)
public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phone;
    public double salary;
    public int age;

//Employee CONSTRUCTOR --> (Конструктор класса должен заполнять эти поля при создании объекта.)
    public Employee (String fullName, String position, String email, String phone, double salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email  = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
    }


//displayInfo() method --> Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
// Вначале объявляем массив объектов
        Employee[] persArray = new Employee[5];
// потом для каждой ячейки массива задаем объект
        persArray[0] = new Employee("Leyla Rzazade", "Supply Chain Specialist", "leila.rzazade@gmail.com", "+994559266868", 1000, 24);
        persArray[1] = new Employee("Tom Cruise", "Actor", "tom.cruise@gmail.com", "010-687-094-123", 100000, 61);
        persArray[2] = new Employee("Antonie Felices", "Customer Support Specialist", "antoine.felices@gmail.com", "343-343-868", 25000, 23);
        persArray[3] = new Employee("Ali Ahmedov", "General Manager", "ali.ahmedov@gmail.com", "+9945555868", 17000, 45);
        persArray[4] = new Employee("Sara Asgerova", "HR Specialist", "sara.asgrv@mail.ru", "+994559263468", 900, 40);

        for (Employee employee : persArray) {
            if (employee.age > 40) {
                employee.displayInfo();
                System.out.println(); //printing empty line after each employee
            }
        }
    }


}
