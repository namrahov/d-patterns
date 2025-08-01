package templatemethod;

public class UserServiceImpl implements UserService {

    @Override
    public boolean checkUsername(String username) {
        return false;
    }

    @Override
    public boolean checkPassword(String password) {
        return false;
    }

    @Override
    public boolean checkDB(String username, String password) {
        return false;
    }
}
