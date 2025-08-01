package templatemethod;

public class TemplateMain {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        UserService adminService = new AdminServiceImpl();

        userService.login("nurlan", "123");
        adminService.login("admin", "321");
    }
}
