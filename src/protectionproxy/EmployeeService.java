package protectionproxy;

// Ortak arayüz
interface EmployeeService {
    void getEmployee(String employeeId);
    void updateEmployee(String employeeId, String newData);
}
