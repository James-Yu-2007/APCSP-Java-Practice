package homePractice.Classes.Inheritance;

public class Main {
    public static void main(String[] args) {
        Q4();
    }

    public static void Q1(){
        Animal animal = new Animal();
        Cat cat = new Cat();        
        animal.makeSound();
        cat.makeSound();
    }

    public static void Q2(){
        Car car = new Car();
        car.drive();
    }

    public static void Q3(){
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void Q4(){
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();
        employee.work();
        hrManager.work();
        hrManager.addEmployee();
    }
}
