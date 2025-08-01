package protectionproxy;

// Gerçek nesne: Çalışan veritabanı servisi
class RealEmployeeService implements EmployeeService {
    @Override
    public void getEmployee(String employeeId) {
        System.out.println("Getting employee data for ID: " + employeeId);
        // Gerçek veritabanı erişimi simüle ediliyor
    }

    @Override
    public void updateEmployee(String employeeId, String newData) {
        System.out.println("Updating employee " + employeeId + " with new data: " + newData);
        // Gerçek güncelleme işlemi
    }
}
