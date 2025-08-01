package templatemethod;

public interface UserService {
    default void login(String username, String password) {
        if(!checkUsername(username)) {
            System.out.println(username);
            return;
        }

        if(!checkPassword(password)) {
            System.out.println(password);
            return;
        }

        if(!checkDB(username, password)) {
            System.out.println(username + password);
            return;
        }
    }

    boolean checkUsername(String username);
    boolean checkPassword(String password);
    boolean checkDB(String username, String password);
}
