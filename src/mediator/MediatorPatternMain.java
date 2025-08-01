package mediator;

public class MediatorPatternMain {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");
        User charlie = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.send("Hi everyone!");
        bob.send("Hey Alice, what's up?");
    }

}
