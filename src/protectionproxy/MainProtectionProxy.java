package protectionproxy;

public class MainProtectionProxy {
    public static void main(String[] args) {
        // Kullanıcı rolü "user" olan proxy
        EmployeeService userProxy = new EmployeeServiceProxy("user");
        userProxy.getEmployee("EMP001"); // Erişim serbest
        userProxy.updateEmployee("EMP001", "New Name"); // Erişim reddedilir

        System.out.println();

        // Kullanıcı rolü "admin" olan proxy
        EmployeeService adminProxy = new EmployeeServiceProxy("admin");
        adminProxy.getEmployee("EMP001"); // Erişim serbest
        adminProxy.updateEmployee("EMP001", "New Name"); // Erişim serbest
    }
}
