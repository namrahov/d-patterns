package protectionproxy;

// Protection Proxy: Erişimi kontrol eder
class EmployeeServiceProxy implements EmployeeService {
    private RealEmployeeService realService;
    private String userRole; // Kullanıcının rolü (örneğin, "admin" veya "user")

    public EmployeeServiceProxy(String userRole) {
        this.userRole = userRole;
    }

    private void initializeRealServiceIfNeeded() {
        if (realService == null) {
            realService = new RealEmployeeService();
        }
    }

    @Override
    public void getEmployee(String employeeId) {
        initializeRealServiceIfNeeded();
        // Okuma erişimi herkes için serbest
        realService.getEmployee(employeeId);
    }

    @Override
    public void updateEmployee(String employeeId, String newData) {
        initializeRealServiceIfNeeded();
        if ("admin".equals(userRole)) {
            realService.updateEmployee(employeeId, newData);
        } else {
            System.out.println("Access denied: You do not have permission to update employee data.");
            // İsteğe göre exception fırlatılabilir: throw new SecurityException("Access denied");
        }
    }
}
