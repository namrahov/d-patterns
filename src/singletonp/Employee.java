package singletonp;

public class Employee {
    private static volatile Employee instance;

    private Employee() {
    }

    public static Employee getInstance() {
        if (instance == null) {
            synchronized (Employee.class) {
                if (instance == null) {
                    instance = new Employee();
                    return instance;
                }
            }
        }

        return instance;
    }

}
