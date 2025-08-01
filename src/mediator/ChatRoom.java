package mediator;

public class ChatRoom implements ChatMediator {
    private java.util.List<User> users;

    public ChatRoom() {
        this.users = new java.util.ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
