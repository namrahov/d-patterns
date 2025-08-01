package memento;

public class Caretaker {
    private java.util.List<Memento> history;
    private int currentIndex;

    public Caretaker() {
        this.history = new java.util.ArrayList<>();
        this.currentIndex = -1;
    }

    public void addMemento(Memento memento) {
        // Remove future states if we're adding after an undo
        while (currentIndex < history.size() - 1) {
            history.remove(history.size() - 1);
        }
        history.add(memento);
        currentIndex++;
    }

    public Memento undo() {
        if (currentIndex > 0) {
            return history.get(--currentIndex);
        }
        return null;
    }

    public Memento redo() {
        if (currentIndex < history.size() - 1) {
            return history.get(++currentIndex);
        }
        return null;
    }
}