package singletonp;

public class MainSingleton {
    public static void main(String[] args) {
        Employee employee = Employee.getInstance();
        Employee employee1 = Employee.getInstance();
        System.out.println(employee1.equals(employee));
    }
}
