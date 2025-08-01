package templatemethod;

public class AdminServiceImpl implements UserService {
    @Override
    public boolean checkUsername(String username) {
        return true;
    }

    @Override
    public boolean checkPassword(String password) {
        return true;
    }

    @Override
    public boolean checkDB(String username, String password) {
        return true;
    }
}
